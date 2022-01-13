package com.wed.jj.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class GuestBook {
    private long id;
    private String nick;
    private String ip;
    private String comment;
    private Date date;
}
