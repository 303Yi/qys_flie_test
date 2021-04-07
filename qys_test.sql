/*
 Navicat Premium Data Transfer

 Source Server         : mysql57
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3305
 Source Schema         : qys_test

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 07/04/2021 21:06:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_flie
-- ----------------------------
DROP TABLE IF EXISTS `t_flie`;
CREATE TABLE `t_flie`  (
  `UUID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'UUID',
  `szie` bigint(255) NULL DEFAULT NULL COMMENT '文件大小',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件类型',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名',
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保存目录',
  `new_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`UUID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_flie
-- ----------------------------
INSERT INTO `t_flie` VALUES ('01284e214f0144e483d415efcf61f448', 69385, 'image/jpeg', '222.jpg', '20210407184538', '/files/2021-04-07', '2021040718453801284e214f0144e483d415efcf61f448.jpg');
INSERT INTO `t_flie` VALUES ('49fe111a83cb4da0a7fc0ce59b6e8fa7', 29025, 'application/octet-stream', 'C:\\Users\\13488\\Desktop\\QQ图片20210113220325.png', '20210407200038', '/files/2021-04-07', '2021040720003849fe111a83cb4da0a7fc0ce59b6e8fa7.png');
INSERT INTO `t_flie` VALUES ('6b122539abe2498b9ed22f74bbe294ad', 29025, 'application/octet-stream', 'C:\\Users\\13488\\Desktop\\QQ图片20210113220325.png', '20210407205836', '/files/2021-04-07', '202104072058366b122539abe2498b9ed22f74bbe294ad.png');
INSERT INTO `t_flie` VALUES ('7757b64369c04c35a9eb0f991e7c06a5', 29025, 'application/octet-stream', 'C:\\Users\\13488\\Desktop\\QQ图片20210113220325.png', '20210407205342', '/files/2021-04-07', '202104072053427757b64369c04c35a9eb0f991e7c06a5.png');
INSERT INTO `t_flie` VALUES ('935f0959dec24424b61bbb31a6352110', 29025, 'application/octet-stream', 'C:\\Users\\13488\\Desktop\\QQ图片20210113220325.png', '20210407205749', '/files/2021-04-07', '20210407205749935f0959dec24424b61bbb31a6352110.png');
INSERT INTO `t_flie` VALUES ('aad3fc589d3d49109c5119c682f5f32d', 69385, 'image/jpeg', '222.jpg', '20210407185325', '/files/2021-04-07', '20210407185325aad3fc589d3d49109c5119c682f5f32d.jpg');
INSERT INTO `t_flie` VALUES ('c6bb807686ad44d9bfba99bc72e1ea54', 69385, 'image/jpeg', '222.jpg', '20210407185326', '/files/2021-04-07', '20210407185326c6bb807686ad44d9bfba99bc72e1ea54.jpg');
INSERT INTO `t_flie` VALUES ('d064096a70bf47deaf10737f49faa4d9', 69385, 'image/jpeg', '222.jpg', '20210407185327', '/files/2021-04-07', '20210407185327d064096a70bf47deaf10737f49faa4d9.jpg');
INSERT INTO `t_flie` VALUES ('d1a25ddcca6043b9a4d10d6f9671ab8b', 69385, 'image/jpeg', '222.jpg', '20210407185327', '/files/2021-04-07', '20210407185327d1a25ddcca6043b9a4d10d6f9671ab8b.jpg');
INSERT INTO `t_flie` VALUES ('e1609a511edb4efc8ee1c4f6358007ce', 29025, 'application/octet-stream', 'C:\\Users\\13488\\Desktop\\QQ图片20210113220325.png', '20210407205626', '/files/2021-04-07', '20210407205626e1609a511edb4efc8ee1c4f6358007ce.png');
INSERT INTO `t_flie` VALUES ('f0bcd74b93914c7780f9b209c2bda394', 69385, 'image/jpeg', '222.jpg', '20210407185328', '/files/2021-04-07', '20210407185328f0bcd74b93914c7780f9b209c2bda394.jpg');

SET FOREIGN_KEY_CHECKS = 1;
