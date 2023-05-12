/*
 Navicat Premium Data Transfer

 Source Server         : shaonian
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : api_project

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 12/05/2023 12:34:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for interface_info
-- ----------------------------
DROP TABLE IF EXISTS `interface_info`;
CREATE TABLE `interface_info`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  `description` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '描述',
  `url` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '接口地址',
  `requestParams` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请求参数',
  `requestHeader` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '请求头',
  `responseHeader` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '响应头',
  `status` int(0) NOT NULL DEFAULT 0 COMMENT '接口状态（0-关闭，1-开启）',
  `method` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请求类型',
  `userId` bigint(0) NOT NULL COMMENT '创建人',
  `createTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updateTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `isDelete` tinyint(0) NOT NULL DEFAULT 0 COMMENT '是否删除(0-未删, 1-已删)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '接口信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of interface_info
-- ----------------------------
INSERT INTO `interface_info` VALUES (1, 'getNameByGet', '获取名字', 'http://101.200.215.56:9800/api/getNameByGet', 'string', '潘博涛', '谭聪健', 1, 'GET', 95534531, '2023-04-14 19:15:59', '2023-05-09 20:37:43', 0);
INSERT INTO `interface_info` VALUES (2, 'getNameByPost', '获取名字', 'http://101.200.215.56:9800/api/getNameByPost', 'string', '潘懿轩', '马鸿涛', 1, 'POST', 3982575846, '2023-04-14 19:15:59', '2023-05-09 20:37:52', 0);
INSERT INTO `interface_info` VALUES (3, 'getGirl', '随机获取小姐姐视频', 'http://101.200.215.56:9800/api/getGirl', '', '冯子默', '彭哲瀚', 1, 'GET', 121776355, '2023-04-14 19:15:59', '2023-05-09 20:37:55', 0);
INSERT INTO `interface_info` VALUES (4, 'getChickenSoup', '每日毒鸡汤', 'http://101.200.215.56:9800/api/getChickenSoup', '', '董思源', '田晓博', 1, 'GET', 74, '2023-04-14 19:15:59', '2023-05-09 20:37:58', 0);
INSERT INTO `interface_info` VALUES (5, '傅志强', '陈梓晨', 'www.jordan-reinger.com', 'asdfasdfasd', '金志强', '熊锦程', 0, '邓睿渊', 35542559, '2023-04-14 19:15:59', '2023-04-14 19:15:59', 0);
INSERT INTO `interface_info` VALUES (6, '吕黎昕', '孔越彬', 'www.fe-okon.info', 'asdfasdfasd', '万伟宸', '林昊然', 0, '孟荣轩', 1445, '2023-04-14 19:15:59', '2023-04-14 19:15:59', 0);
INSERT INTO `interface_info` VALUES (7, '夏雪松', '许子骞', 'www.lashawna-legros.co', 'asdfasdfasd', '蔡昊然', '胡鹏涛', 0, '钟立辉', 3475514, '2023-04-14 19:15:59', '2023-04-14 19:15:59', 0);
INSERT INTO `interface_info` VALUES (8, '严钰轩', '阎志泽', 'www.kay-funk.biz', 'asdfasdfasd', '莫皓轩', '郭黎昕', 0, '龚天宇', 7956, '2023-04-14 19:15:59', '2023-04-14 19:15:59', 0);
INSERT INTO `interface_info` VALUES (9, '萧嘉懿', '曹熠彤', 'www.margarette-lindgren.biz', 'asdfasdfasd', '田泽洋', '邓睿渊', 0, '梁志强', 98, '2023-04-14 19:15:59', '2023-04-14 19:15:59', 0);
INSERT INTO `interface_info` VALUES (10, '杜驰', '冯思源', 'www.vashti-auer.org', 'asdfasdfasd', '黎健柏', '武博文', 0, '李伟宸', 9, '2023-04-14 19:15:59', '2023-04-14 19:15:59', 0);
INSERT INTO `interface_info` VALUES (11, 'sdf ad', 'asdf ', 'http://localhost:9800/api/name/user', ' asdf as', 'df asds', ' dfasf', 1, 'POST', 3, '2023-04-14 21:02:36', '2023-04-23 13:12:37', 0);
INSERT INTO `interface_info` VALUES (12, 'sdf ad', 'asdf ', 'asd fsd', ' asdf as', 'df asds', ' dfasf', 0, ' aasd f', 3, '2023-04-14 21:14:44', '2023-04-14 21:15:23', 1);
INSERT INTO `interface_info` VALUES (13, 'sdf ad', 'asdf ', 'asd fsd', ' asdf as', 'df asds', ' dfasf', 0, ' aasd f', 3, '2023-04-14 21:15:05', '2023-04-14 21:15:21', 1);
INSERT INTO `interface_info` VALUES (14, 'sdf ad', 'asdf ', 'asd fsd', ' asdf as', 'df asds', ' dfasf', 0, ' aasd f', 3, '2023-04-14 21:19:45', '2023-04-22 20:55:02', 1);

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `gender` tinyint(0) NOT NULL DEFAULT 0 COMMENT '性别（0-男, 1-女）',
  `education` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学历',
  `place` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地点',
  `job` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '职业',
  `contact` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系方式',
  `loveExp` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '感情经历',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '内容（个人介绍）',
  `photo` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '照片地址',
  `reviewStatus` int(0) NOT NULL DEFAULT 0 COMMENT '状态（0-待审核, 1-通过, 2-拒绝）',
  `reviewMessage` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '审核信息',
  `viewNum` int(0) NOT NULL DEFAULT 0 COMMENT '浏览数',
  `thumbNum` int(0) NOT NULL DEFAULT 0 COMMENT '点赞数',
  `userId` bigint(0) NOT NULL COMMENT '创建用户 id',
  `createTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updateTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `isDelete` tinyint(0) NOT NULL DEFAULT 0 COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '帖子' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of post
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userName` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `userAccount` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '账号',
  `userAvatar` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户头像',
  `gender` tinyint(0) NULL DEFAULT NULL COMMENT '性别',
  `userRole` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'user' COMMENT '用户角色：user / admin',
  `userPassword` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `accessKey` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'accessKey',
  `secretKey` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'secretKey',
  `createTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updateTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `isDelete` tinyint(0) NOT NULL DEFAULT 0 COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uni_userAccount`(`userAccount`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, NULL, 'shaonian', NULL, NULL, 'admin', '95bdda4fea04c064521190505a339ee3', 'b8f7fbcb53784e836c40137f2a904057', '1f7a33c16cd259c6370a02da10a78a71', '2023-04-15 11:56:26', '2023-04-15 20:16:24', 0);
INSERT INTO `user` VALUES (2, NULL, 'jiangzihao', NULL, NULL, 'user', '95bdda4fea04c064521190505a339ee3', '7e2efdfa8744596e04b619aff8ceb95a', '9b5295bea2a1781d54d18a685be05839', '2023-05-06 12:00:23', '2023-05-06 12:00:23', 0);
INSERT INTO `user` VALUES (3, NULL, 'zihao', NULL, NULL, 'user', '95bdda4fea04c064521190505a339ee3', '039eb5746a46780417c56f57fb0da577', '04d3e218e9b7286c71f60fefc9b186c5', '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);

-- ----------------------------
-- Table structure for user_interface_info
-- ----------------------------
DROP TABLE IF EXISTS `user_interface_info`;
CREATE TABLE `user_interface_info`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(0) NOT NULL COMMENT '调用用户 id',
  `interfaceInfoId` bigint(0) NOT NULL COMMENT '接口 id',
  `totalNum` int(0) NOT NULL DEFAULT 0 COMMENT '总调用次数',
  `leftNum` int(0) NOT NULL DEFAULT 0 COMMENT '剩余调用次数',
  `status` int(0) NOT NULL DEFAULT 0 COMMENT '0-正常，1-禁用',
  `createTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updateTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `isDelete` tinyint(0) NOT NULL DEFAULT 0 COMMENT '是否删除(0-未删, 1-已删)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户调用接口关系' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_interface_info
-- ----------------------------
INSERT INTO `user_interface_info` VALUES (1, 1, 2, 5, 10, 0, '2023-04-23 15:13:44', '2023-04-26 10:20:10', 0);
INSERT INTO `user_interface_info` VALUES (2, 1, 11, 4, 9, 0, '2023-04-23 15:13:56', '2023-04-26 10:20:14', 0);
INSERT INTO `user_interface_info` VALUES (3, 1, 3, 3, 97, 0, '2023-05-06 20:36:58', '2023-05-07 17:01:41', 0);
INSERT INTO `user_interface_info` VALUES (4, 2, 3, 1, 99, 0, '2023-05-06 21:16:23', '2023-05-06 21:17:18', 0);
INSERT INTO `user_interface_info` VALUES (5, 3, 1, 16, 84, 0, '2023-05-06 21:18:44', '2023-05-09 19:44:10', 0);
INSERT INTO `user_interface_info` VALUES (6, 3, 2, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);
INSERT INTO `user_interface_info` VALUES (7, 3, 3, 3, 97, 0, '2023-05-06 21:18:44', '2023-05-09 19:44:19', 0);
INSERT INTO `user_interface_info` VALUES (8, 3, 4, 3, 97, 0, '2023-05-06 21:18:44', '2023-05-06 21:19:42', 0);
INSERT INTO `user_interface_info` VALUES (9, 3, 5, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);
INSERT INTO `user_interface_info` VALUES (10, 3, 6, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);
INSERT INTO `user_interface_info` VALUES (11, 3, 7, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);
INSERT INTO `user_interface_info` VALUES (12, 3, 8, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);
INSERT INTO `user_interface_info` VALUES (13, 3, 9, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);
INSERT INTO `user_interface_info` VALUES (14, 3, 10, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);
INSERT INTO `user_interface_info` VALUES (15, 3, 11, 0, 100, 0, '2023-05-06 21:18:44', '2023-05-06 21:18:44', 0);

SET FOREIGN_KEY_CHECKS = 1;
