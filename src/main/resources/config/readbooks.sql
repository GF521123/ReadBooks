/*
 Navicat Premium Data Transfer

 Source Server         : 521123
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : readbooks

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 02/06/2021 13:58:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book_cha
-- ----------------------------
DROP TABLE IF EXISTS `book_cha`;
CREATE TABLE `book_cha`  (
  `bookcha_id` int(11) NOT NULL COMMENT '章节细分汇总',
  `book_infor_id` int(11) NOT NULL COMMENT '书籍信息books_infor主键',
  `book_order` int(11) NOT NULL COMMENT '书籍次序',
  `book_number` varchar(80) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '书籍章节',
  `book_value` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '书籍内容',
  PRIMARY KEY (`bookcha_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for books_infor
-- ----------------------------
DROP TABLE IF EXISTS `books_infor`;
CREATE TABLE `books_infor`  (
  `book_id` int(11) NOT NULL COMMENT '书籍信息主键（唯一存在）',
  `book_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '书名',
  `book_author` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '作者',
  `upload_date` varchar(0) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '上传日期',
  `book_img` mediumblob NULL COMMENT '主图',
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
