# 用户表
CREATE TABLE user(
  id int(10) PRIMARY KEY AUTO_INCREMENT,
  username varchar(200) UNIQUE DEFAULT NULL,
  userpwd varchar(16) DEFAULT NULL
);


#停车位表
CREATE TABLE space(
  id int(10) PRIMARY KEY AUTO_INCREMENT COMMENT '场地表id',
  cname varchar(20) DEFAULT NULL COMMENT '场地名称',
  cdesc varchar(20) DEFAULT NULL COMMENT '场地描述',
  state int(10) NOT NULL DEFAULT '0' COMMENT '场地状态,1在用，0 空闲,2维修',
  UNIQUE KEY uq_t_space_cname (cname)
);



#客户表
CREATE TABLE customer(
  id int(10) PRIMARY KEY AUTO_INCREMENT COMMENT '客户表id',
  cash int(10) DEFAULT NULL COMMENT '充值的费用或余额',
  ctype int(10) DEFAULT '0' COMMENT '客户类型,1VIP,0普通用户',
  cardno varchar(20) DEFAULT NULL COMMENT '客户编码',
  registerDate date DEFAULT NULL COMMENT '添加时间',
  state int(11) DEFAULT '0' COMMENT '卡的状态，1表示在用，0表示空闲'
);


#记录表
CREATE TABLE record(
  id int(10) PRIMARY KEY AUTO_INCREMENT,
  uid int(10) NOT NULL COMMENT '用户表的id',
  pid int(10) NOT NULL COMMENT '场地表的id',
  cid int(10) NOT NULL COMMENT '客户表的id',
  stime timestamp NULL DEFAULT NULL COMMENT '开始时间',
  etime timestamp NULL DEFAULT NULL COMMENT '结束时间',
  pay int(10) DEFAULT NULL COMMENT '支付费用',
  KEY FK__t_record__uid__1ED998B2 (uid),
  KEY FK__t_record__pid__1FCDBCEB (pid),
  KEY FK__t_record__cid__20C1E124 (cid),
  CONSTRAINT FK_t_record FOREIGN KEY (uid) REFERENCES user (id),
  CONSTRAINT FK__t_record__cid__20C1E124 FOREIGN KEY (cid) REFERENCES customer (id),
  CONSTRAINT FK__t_record__pid__1FCDBCEB FOREIGN KEY (pid) REFERENCES space (id)
);

