/*
Navicat MySQL Data Transfer

Source Server         : 10.10.24.2
Source Server Version : 80018
Source Host           : 10.10.24.2:3306
Source Database       : power

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2020-01-06 12:18:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for auth_function
-- ----------------------------
DROP TABLE IF EXISTS `auth_function`;
CREATE TABLE `auth_function` (
  `auth_fuction_id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `page` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `generatemenu` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `zindex` int(11) DEFAULT NULL,
  PRIMARY KEY (`auth_fuction_id`),
  KEY `FK33r6np87v1p6gge7t6rpcao5h` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of auth_function
-- ----------------------------
INSERT INTO `auth_function` VALUES ('11', '0', '系统管理', 'system', '管理系统角色与权限', null, '1', '1');
INSERT INTO `auth_function` VALUES ('12', '0', '业务管理', 'biz', '业务功能', null, '1', '2');
INSERT INTO `auth_function` VALUES ('31', '0', '系统日志', 'systemlog', '', null, '1', '3');
INSERT INTO `auth_function` VALUES ('32', '31', '日志列表', 'log', '日志列表', 'index/systemlog/log', '1', '1');
INSERT INTO `auth_function` VALUES ('33', '32', '添加日志', 'log:add', '添加日志', '', '0', '2');
INSERT INTO `auth_function` VALUES ('34', '32', '删除日志', 'log:delete', '删除日志', '', '0', '3');
INSERT INTO `auth_function` VALUES ('37', '0', '学科管理', 'subject', '', null, '1', '4');
INSERT INTO `auth_function` VALUES ('38', '37', '学科列表', 'subject:list', '学科列表', 'index/subject/list', '1', '1');
INSERT INTO `auth_function` VALUES ('39', '38', '添加学科', 'subject:add', '添加学科', '', '0', '2');
INSERT INTO `auth_function` VALUES ('40', '38', '编辑学科', 'subject:update', '编辑学科', '', '0', '3');
INSERT INTO `auth_function` VALUES ('41', '38', '删除学科', 'subject:delete', '删除学科', '', '0', '4');
INSERT INTO `auth_function` VALUES ('42', '0', '考生管理', 'student', '', null, '1', '5');
INSERT INTO `auth_function` VALUES ('43', '42', '考生列表', 'student:list', '考生列表', 'index/student/list', '1', '1');
INSERT INTO `auth_function` VALUES ('44', '43', '添加考生', 'student:add', '添加考生', null, '0', '2');
INSERT INTO `auth_function` VALUES ('45', '43', '编辑考生', 'student:update', '编辑考生', null, '0', '3');
INSERT INTO `auth_function` VALUES ('46', '43', '删除考生', 'student:delete', '删除考生', null, '0', '4');
INSERT INTO `auth_function` VALUES ('47', '0', '试题管理', 'question', '试题管理', null, '1', '6');
INSERT INTO `auth_function` VALUES ('48', '47', '试题列表', 'question:list', '试题列表', 'index/question/list', '1', '1');
INSERT INTO `auth_function` VALUES ('49', '48', '添加试题', 'question:add', '添加试题', null, '0', '2');
INSERT INTO `auth_function` VALUES ('50', '48', '编辑试题', 'question:update', '编辑试题', null, '0', '3');
INSERT INTO `auth_function` VALUES ('51', '48', '删除试题', 'question:delete', '删除试题', null, '0', '4');
INSERT INTO `auth_function` VALUES ('52', '0', '考试管理', 'exam', '考试管理', null, '1', '7');
INSERT INTO `auth_function` VALUES ('53', '52', '考试列表', 'exam:list', '考试列表', 'index/exam/list', '1', '1');
INSERT INTO `auth_function` VALUES ('54', '53', '添加考试', 'exam:add', '添加考试', null, '0', '2');
INSERT INTO `auth_function` VALUES ('55', '53', '编辑考试', 'exam:update', '编辑考试', null, '0', '3');
INSERT INTO `auth_function` VALUES ('56', '53', '删除考试', 'exam:delete', '删除考试', null, '0', '4');
INSERT INTO `auth_function` VALUES ('57', '0', '试卷管理', 'examPaper', '试卷管理', null, '1', '8');
INSERT INTO `auth_function` VALUES ('58', '57', '试卷列表', 'examPaper:list', '试卷列表', 'index/examPaper/list', '1', '1');
INSERT INTO `auth_function` VALUES ('60', '58', '编辑试卷', 'examPaper:add', '编辑试卷', null, '0', '2');
INSERT INTO `auth_function` VALUES ('61', '58', '删除试卷', 'examPaper:delete', '删除试卷', null, '0', '3');
INSERT INTO `auth_function` VALUES ('62', '0', '答题管理', 'examPaperAnswer', '答题管理', null, '1', '9');
INSERT INTO `auth_function` VALUES ('63', '62', '答题列表', 'examPaperAnswer:list', '答题列表', 'index/examPaperAnswer/list', '1', '1');
INSERT INTO `auth_function` VALUES ('64', '48', '导入试题', 'examPaperAnswer:import', '导入试题', null, '0', '2');
INSERT INTO `auth_function` VALUES ('65', '0', '成绩统计', 'examStatus', '成绩统计', null, '1', '10');
INSERT INTO `auth_function` VALUES ('66', '65', '统计图表', 'examStatus', '统计图表', 'index/examStatus/status', '1', '1');
INSERT INTO `auth_function` VALUES ('112', '11', '用户管理', 'user:list', '用户管理', 'index/admin/userlist', '1', '3');
INSERT INTO `auth_function` VALUES ('113', '11', '角色管理', 'role:list', '角色管理', 'index/admin/role', '1', '4');
INSERT INTO `auth_function` VALUES ('114', '11', '功能权限管理', 'menu:list', '功能权限管理', 'index/admin/function', '1', '5');
INSERT INTO `auth_function` VALUES ('141', '113', '修改角色', 'role:update', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('142', '113', '添加角色', 'role:add', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('143', '113', '删除角色', 'role:delete', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('144', '114', '添加功能权限', 'menu:add', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('145', '114', '删除功能权限', 'menu:delete', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('146', '114', '修改功能权限', 'menu:update', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('147', '112', '添加用户', 'user:add', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('148', '112', '删除用户', 'user:delete', null, null, '0', null);
INSERT INTO `auth_function` VALUES ('149', '112', '修改用户', 'user:update', null, null, '0', null);

-- ----------------------------
-- Table structure for auth_role
-- ----------------------------
DROP TABLE IF EXISTS `auth_role`;
CREATE TABLE `auth_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of auth_role
-- ----------------------------
INSERT INTO `auth_role` VALUES ('1', '管理员', 'manager', null);
INSERT INTO `auth_role` VALUES ('2', '业务员', 'biz', '业务管理员');
INSERT INTO `auth_role` VALUES ('6', '考试管理员', 'exam-admin', '考试管理员');
INSERT INTO `auth_role` VALUES ('7', '班主任', 'classleader', '');

-- ----------------------------
-- Table structure for role_function
-- ----------------------------
DROP TABLE IF EXISTS `role_function`;
CREATE TABLE `role_function` (
  `role_function_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`role_function_id`),
  KEY `fk_rolefunction_auth_fucntion` (`role_function_id`),
  CONSTRAINT `fk_rolefunction_auth_fucntion` FOREIGN KEY (`role_function_id`) REFERENCES `auth_function` (`auth_fuction_id`),
  CONSTRAINT `fk_rolefunction_role` FOREIGN KEY (`role_id`) REFERENCES `auth_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of role_function
-- ----------------------------
INSERT INTO `role_function` VALUES ('11', '1');
INSERT INTO `role_function` VALUES ('11', '2');
INSERT INTO `role_function` VALUES ('12', '1');
INSERT INTO `role_function` VALUES ('37', '6');
INSERT INTO `role_function` VALUES ('38', '6');
INSERT INTO `role_function` VALUES ('39', '6');
INSERT INTO `role_function` VALUES ('40', '6');
INSERT INTO `role_function` VALUES ('41', '6');
INSERT INTO `role_function` VALUES ('42', '6');
INSERT INTO `role_function` VALUES ('42', '7');
INSERT INTO `role_function` VALUES ('43', '6');
INSERT INTO `role_function` VALUES ('43', '7');
INSERT INTO `role_function` VALUES ('44', '6');
INSERT INTO `role_function` VALUES ('44', '7');
INSERT INTO `role_function` VALUES ('45', '6');
INSERT INTO `role_function` VALUES ('45', '7');
INSERT INTO `role_function` VALUES ('46', '6');
INSERT INTO `role_function` VALUES ('46', '7');
INSERT INTO `role_function` VALUES ('47', '6');
INSERT INTO `role_function` VALUES ('48', '6');
INSERT INTO `role_function` VALUES ('49', '6');
INSERT INTO `role_function` VALUES ('50', '6');
INSERT INTO `role_function` VALUES ('51', '6');
INSERT INTO `role_function` VALUES ('52', '6');
INSERT INTO `role_function` VALUES ('52', '7');
INSERT INTO `role_function` VALUES ('53', '6');
INSERT INTO `role_function` VALUES ('53', '7');
INSERT INTO `role_function` VALUES ('54', '6');
INSERT INTO `role_function` VALUES ('54', '7');
INSERT INTO `role_function` VALUES ('55', '6');
INSERT INTO `role_function` VALUES ('55', '7');
INSERT INTO `role_function` VALUES ('56', '6');
INSERT INTO `role_function` VALUES ('56', '7');
INSERT INTO `role_function` VALUES ('57', '6');
INSERT INTO `role_function` VALUES ('58', '6');
INSERT INTO `role_function` VALUES ('60', '6');
INSERT INTO `role_function` VALUES ('61', '6');
INSERT INTO `role_function` VALUES ('62', '6');
INSERT INTO `role_function` VALUES ('63', '6');
INSERT INTO `role_function` VALUES ('64', '6');
INSERT INTO `role_function` VALUES ('65', '6');
INSERT INTO `role_function` VALUES ('65', '7');
INSERT INTO `role_function` VALUES ('66', '6');
INSERT INTO `role_function` VALUES ('66', '7');
INSERT INTO `role_function` VALUES ('112', '1');
INSERT INTO `role_function` VALUES ('112', '2');
INSERT INTO `role_function` VALUES ('113', '1');
INSERT INTO `role_function` VALUES ('114', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `salary` double DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `station` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=402901 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('3', 'admin', '123', '10000', '2017-12-12 00:00:00', '男', '总公司', '110', null);
INSERT INTO `t_user` VALUES ('402898', 'matrix', '123456', '2222', '2020-01-06 16:00:00', '', '分公司', '18986256214', null);
INSERT INTO `t_user` VALUES ('402899', 'matrix2', '123456', '1111', '2019-12-31 16:00:00', '男', '总公司', '18986256214', null);
INSERT INTO `t_user` VALUES ('402900', 'leader1', '123456', '1000', '2020-01-06 16:00:00', '男', '总公司', '18986256214', null);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `role_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `fk_userrole_role` (`role_id`),
  CONSTRAINT `fk_userrole_role` FOREIGN KEY (`role_id`) REFERENCES `auth_role` (`role_id`),
  CONSTRAINT `fk_userrole_user` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '3');
INSERT INTO `user_role` VALUES ('2', '3');
INSERT INTO `user_role` VALUES ('6', '402898');
INSERT INTO `user_role` VALUES ('6', '402899');
INSERT INTO `user_role` VALUES ('7', '402900');
