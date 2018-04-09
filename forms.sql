/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : forms

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2018-04-09 10:49:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for allform
-- ----------------------------
DROP TABLE IF EXISTS `allform`;
CREATE TABLE `allform` (
  `id` int(11) NOT NULL auto_increment COMMENT '主键id',
  `form_name` varchar(50) default NULL COMMENT '表名拼音拼接',
  `name_paraphrase` varchar(100) default NULL COMMENT 'form_name对应的中文释义',
  `version` int(3) default NULL COMMENT '版本号',
  `creation_date` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建日期',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of allform
-- ----------------------------
INSERT INTO `allform` VALUES ('14', 'cslcb009', '测试里程碑009', null, '2017-08-24 13:41:55');
INSERT INTO `allform` VALUES ('16', 'cslcb911', '测试里程碑911', null, '2017-08-29 23:54:36');
INSERT INTO `allform` VALUES ('17', 'hh', '花花', null, '2017-09-03 10:24:24');

-- ----------------------------
-- Table structure for cslcb009
-- ----------------------------
DROP TABLE IF EXISTS `cslcb009`;
CREATE TABLE `cslcb009` (
  `id` int(11) NOT NULL auto_increment,
  `allform_id` int(5) default NULL COMMENT 'allform表中的id',
  `creation_date` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '录入时间',
  `sole_id` int(6) default NULL COMMENT '唯一识别id',
  `writer_id` int(6) default NULL COMMENT '录入人员ID',
  `status` int(1) default NULL COMMENT '状态标示，1为存在0为删除',
  `sr1` varchar(100) default NULL COMMENT '输入1',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cslcb009
-- ----------------------------

-- ----------------------------
-- Table structure for cslcb911
-- ----------------------------
DROP TABLE IF EXISTS `cslcb911`;
CREATE TABLE `cslcb911` (
  `id` int(11) NOT NULL auto_increment,
  `allform_id` int(5) default '0' COMMENT 'allform表中的id',
  `creation_date` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '录入时间',
  `sole_id` int(6) default NULL COMMENT '唯一识别id',
  `writer_id` int(6) default NULL COMMENT '录入人员ID',
  `status` int(1) default '1' COMMENT '状态标示，1为存在0为删除',
  `cssr` varchar(100) default NULL COMMENT '测试输入',
  `gmzzzz` varchar(100) default NULL COMMENT '国民增长总值',
  `ssmymrzdh` varchar(100) default NULL COMMENT '试试没有默认值的话',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cslcb911
-- ----------------------------
INSERT INTO `cslcb911` VALUES ('1', '1', '2017-08-31 14:45:59', '1', '1', '1', '说点什么好呢', null, null);
INSERT INTO `cslcb911` VALUES ('2', '1', '2017-08-31 14:46:55', '1', '1', '1', '说点什么好呢', null, null);
INSERT INTO `cslcb911` VALUES ('3', '-1', '2017-08-31 14:48:54', '1', '1', '1', '说点什么好呢', null, null);
INSERT INTO `cslcb911` VALUES ('4', '0', '2017-08-31 14:49:15', '1', '1', '1', '说点什么好呢', null, null);
INSERT INTO `cslcb911` VALUES ('5', '-1', '2017-08-31 14:51:01', '-1', '-1', '1', '不说了不说了', null, null);
INSERT INTO `cslcb911` VALUES ('6', '-1', '2017-08-31 14:52:59', '-1', '-1', '1', '第二次测试', null, null);
INSERT INTO `cslcb911` VALUES ('7', '-1', '2017-08-31 14:54:39', '-1', '-1', '1', '两个了', '是呢，没错', null);

-- ----------------------------
-- Table structure for form
-- ----------------------------
DROP TABLE IF EXISTS `form`;
CREATE TABLE `form` (
  `id` int(11) NOT NULL auto_increment,
  `form_id` int(8) default NULL COMMENT '表单编号',
  `tag_id` int(8) default NULL COMMENT '标签编号',
  `tag_name` varchar(20) default NULL COMMENT '字段name',
  `label_name` varchar(20) default NULL COMMENT '面板提示名称',
  `multi_value` varchar(100) default NULL COMMENT '用于储存下拉框或复选框的数据',
  `paixu` int(3) default NULL COMMENT '输入标签的序号、排序',
  `default_value` varchar(100) default NULL COMMENT '表单字段的默认值',
  `check_rule` int(1) default NULL COMMENT '数据检验采取的规则',
  `status` int(1) NOT NULL default '1' COMMENT '是否删除标记，1为存在0为删除',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of form
-- ----------------------------
INSERT INTO `form` VALUES ('11', '16', '1', 'cssr', '测试输入', '', '0', '请输入', '4', '1');
INSERT INTO `form` VALUES ('12', '16', '1', 'gmzzzz', '国民增长总值', '', '0', '请输入啊', '4', '1');
INSERT INTO `form` VALUES ('13', '16', '1', 'ssmymrzdh', '试试没有默认值的话', '', '0', '', '3', '1');
INSERT INTO `form` VALUES ('14', '17', '1', 'xm', '姓名', '', '0', '花花', '1', '1');
INSERT INTO `form` VALUES ('15', '14', '1', 'sr1', '输入1', '', '0', '没有', '1', '1');

-- ----------------------------
-- Table structure for forms
-- ----------------------------
DROP TABLE IF EXISTS `forms`;
CREATE TABLE `forms` (
  `id` int(11) NOT NULL auto_increment,
  `form_id` int(6) NOT NULL default '999000' COMMENT 'allform表中form的id',
  `form_name` varchar(50) default NULL COMMENT '前台显示的表单模板名',
  `fields` text COMMENT '该表单所有字段',
  `status` int(1) NOT NULL default '1' COMMENT '是否删除标记，1为存在0为删除',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of forms
-- ----------------------------
INSERT INTO `forms` VALUES ('9', '14', '测试里程碑009', 'allform_id,sole_id,writer_id,sr1', '1');
INSERT INTO `forms` VALUES ('10', '16', '测试里程碑911', 'allform_id,sole_id,writer_id,cssr,gmzzzz,ssmymrzdh', '1');
INSERT INTO `forms` VALUES ('11', '17', '花花', 'allform_id,sole_id,writer_id,xm', '1');

-- ----------------------------
-- Table structure for hh
-- ----------------------------
DROP TABLE IF EXISTS `hh`;
CREATE TABLE `hh` (
  `id` int(11) NOT NULL auto_increment,
  `allform_id` int(5) default NULL COMMENT 'allform表中的id',
  `creation_date` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '录入时间',
  `sole_id` int(6) default NULL COMMENT '唯一识别id',
  `writer_id` int(6) default NULL COMMENT '录入人员ID',
  `status` int(1) default NULL COMMENT '状态标示，1为存在0为删除',
  `xm` varchar(100) default NULL COMMENT '姓名',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hh
-- ----------------------------
INSERT INTO `hh` VALUES ('1', '-1', '2017-09-03 10:25:46', '-1', '-1', null, '王佳成');

-- ----------------------------
-- Table structure for tags
-- ----------------------------
DROP TABLE IF EXISTS `tags`;
CREATE TABLE `tags` (
  `id` int(11) NOT NULL auto_increment,
  `type` varchar(8) default NULL COMMENT '标签类型',
  `code` text COMMENT '代码',
  `code_grade` text,
  `css` varchar(200) default NULL COMMENT '层叠样式表',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tags
-- ----------------------------
INSERT INTO `tags` VALUES ('1', 'input', '<div class=\"form-group\"  id=\"re|||||\">\r\n	<label class=\"\">label_name|||||</label>\r\n	<input type=\"text\" name=\"name|||||\" class=\"form-control\" placeholder=\"\" value=\"value|||||\">\r\n</div>', null, null);
INSERT INTO `tags` VALUES ('2', 'checkbox', '<div class=\"form-group\"   id=\"re|||||\">\r\n	<label for=\"exampleInputFile\">label_name|||||</label>\r\n		code_grade|||||\r\n</div>', '<label class=\"checkbox-inline\">\r\n	<input type=\"checkbox\" id=\"inlineCheckbox1\" value=\"multi_value|||||\">multi_value|||||\r\n</label>', null);
INSERT INTO `tags` VALUES ('3', 'select', '<div class=\"form-group\" id=\"re|||||\">\r\n<label for=\"exampleInputFile\">label_name|||||</label>\r\n  <select class=\"form-control\">\r\n  	code_grade|||||\r\n  </select>\r\n</div>', '<option value=\"multi_value|||||\">multi_value|||||</option>', null);
INSERT INTO `tags` VALUES ('4', 'textarea', '<div class=\"form-group\"     id=\"re|||||\">\r\n<label>label_name|||||</label>\r\n	<textarea class=\"form-control\" rows=\"3\" name=\"name|||||\" value=\"value|||||\"></textarea>\r\n</div>', null, null);
SET FOREIGN_KEY_CHECKS=1;
