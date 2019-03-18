package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Emp;
import org.junit.Test;

import java.util.List;

public class CacheTest extends AbstractMapperTest {
    @Test
    public void cache(){
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        List<Emp> empList=empMapper.getList();
        List<Emp> empList1=empMapper.getList();
    }
    @Test
    public void cache1(){
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        List<Emp> empList=empMapper.getList();
        for(Emp emp:empList){
            if(emp.getEmpNo()==7369){
                emp.setCom(888.0);
                empMapper.update(emp);
            }

        }
        List<Emp> empList2=empMapper.getList();

    }



}
