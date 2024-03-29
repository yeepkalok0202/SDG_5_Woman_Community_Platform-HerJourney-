package com.example.wia2007mad.AllModules;


import java.util.Comparator;

public class HubPostModel {
    String description;
    String ptime;
    String title;
    String udp;
    String uemail;
    String uid;
    String uimage;
    String uname;
    String pid;



    String plike;
    String pcomment;

    public HubPostModel(String description, String ptime, String title, String udp, String uemail, String uid, String uimage, String uname, String pid, String plike, String pcomment) {
        this.description = description;
        this.ptime = ptime;
        this.title = title;
        this.udp = udp;
        this.uemail = uemail;
        this.uid = uid;
        this.uimage = uimage;
        this.uname = uname;
        this.pid = pid;
        this.plike = plike;
        this.pcomment = pcomment;
    }

    public HubPostModel() {
    }

    static Comparator<HubPostModel> descendingnameComparator=new Comparator<HubPostModel>() {
        @Override
        public int compare(HubPostModel o1, HubPostModel o2) {
            return o2.getPtime().compareTo(o1.getPtime());
        }
    };
    public String getPlike() {
        return plike;
    }

    public void setPlike(String plike) {
        this.plike = plike;
    }

    public String getPcomment() {
        return pcomment;
    }

    public void setPcomment(String pcomment) {
        this.pcomment = pcomment;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUdp() {
        return udp;
    }

    public void setUdp(String udp) {
        this.udp = udp;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

}
