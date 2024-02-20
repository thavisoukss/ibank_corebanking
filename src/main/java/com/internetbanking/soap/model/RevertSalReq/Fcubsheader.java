package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

@Data
public class Fcubsheader {

    public String source;
    public String ubscomp;
    public String msgid;
    public String correlid;
    public String userid;
    public String entity;
    public String branch;
    public Object moduleid;
    public String service;
    public String operation;
    public String sourceoperation;
    public Object sourceuserid;
    public String destination;
    public Object multitripid;
    public String functionid;
    public String action;
    public String msgstat;
    public Object snapshotid;
    public Object password;
    public Object addl;

}
