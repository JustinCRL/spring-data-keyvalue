package com.example.demo.sql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

@KeySpace
//@Entity
public class KeyValue {
    @Id
    public String key;
    public String value;
}
