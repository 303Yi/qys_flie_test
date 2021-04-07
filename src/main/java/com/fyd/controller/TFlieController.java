package com.fyd.controller;

import com.fyd.entity.TFlie;
import com.fyd.service.TFlieService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * (TFlie)表控制层
 *
 * @author makejava
 * @since 2021-04-07 17:57:38
 */
@RestController
@RequestMapping("/")
public class TFlieController {
    /**
     * 服务对象
     */
    @Resource
    private TFlieService tFlieService;
    @PostMapping("/upload")
    public String upload(MultipartFile file) throws IOException {
        String name = file.getOriginalFilename();
        String extension  = "." + FilenameUtils.getExtension(name);
        String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String uuid =  UUID.randomUUID().toString().replace("-","");
        String newName = date+uuid + extension ;
        Long szie = file.getSize();
        String type = file.getContentType();
        // 处理根据日期生成目录
        // 通过相对路径获取绝对路径
        String realPath = "E:/web/static/files";
        String dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String dateDirPath = realPath + "/" + dateFormat;
        File dateDir = new File(dateDirPath);
        // 如果文件不存在，则创建
        if(!dateDir.exists()) {
            dateDir.mkdirs();
        }

        // 处理文件上传
        file.transferTo(new File(dateDir,newName));
        TFlie tFlie = new TFlie();
        tFlie.setNewName(newName).setName(name).setCreateTime(date).setFilePath("/files/"+dateFormat).setType(type).setSzie(szie).setUuid(uuid);
        tFlieService.insert(tFlie);

        return tFlie.getUuid();
    }
    /**
     *   文件下载
     * @param id
     */
    @GetMapping("/download/{id}")
    public String download(String openStyle,HttpServletResponse response, @PathVariable String id) throws IOException {
        // 获取打开方式
        openStyle = openStyle==null ? "attachment" : openStyle;

        // 获取文件信息
        TFlie userFile = tFlieService.queryById(id);
        //根据文件信息中文件的名字 和 文件存储路径获取文件输入流
        String realPath = "E:/web/static/"+userFile.getFilePath();
        // 获取文件输入流
        FileInputStream is = new FileInputStream(new File(realPath, userFile.getNewName()));
        //附件下载
        response.setHeader("content-disposition",openStyle+";fileName="+ URLEncoder.encode(userFile.getName(),"UTF-8"));
        //获取响应输出流
        ServletOutputStream os = response.getOutputStream();
        // 文件拷贝
        IOUtils.copy(is,os);
        //优雅的关闭流
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(os);
        return userFile.toString();
    }

    /**
     *  展示所有文件信息
     * @return
     */
    @GetMapping("/showAll")
    public List<TFlie> findAll(){
        //根据id查询到所有的文件信息
        List<TFlie> userFiles = tFlieService.allFile();

        return userFiles;
    }
}
