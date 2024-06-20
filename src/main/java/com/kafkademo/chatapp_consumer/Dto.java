package com.kafkademo.chatapp_consumer;

import org.springframework.stereotype.Component;

@Component
public class Dto {
private long timestamp;
private  long recordoffset;
private int partition;
private String recordkey;
private String recordvalue;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getRecordkey() {
        return recordkey;
    }

    public void setRecordkey(String recordkey) {
        this.recordkey = recordkey;
    }

    public String getRecordvalue() {
        return recordvalue;
    }

    public void setRecordvalue(String recordvalue) {
        this.recordvalue = recordvalue;
    }

    public long getRecordoffset() {
        return recordoffset;
    }

    public void setRecordoffset(long recordoffset) {
        this.recordoffset = recordoffset;
    }

    public int getPartition() {
        return partition;
    }

    public void setPartition(int partition) {
        this.partition = partition;
    }
}


