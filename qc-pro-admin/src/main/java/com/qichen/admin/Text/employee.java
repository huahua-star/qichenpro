package com.qichen.admin.Text;

import lombok.Data;
import org.springframework.beans.factory.parsing.BeanEntry;
import org.springframework.context.annotation.Bean;

import javax.swing.text.html.parser.Entity;

@Data
public class employee  {
    private String eid;
    private String ename;
    private String salary;
    private String deptid;

}
