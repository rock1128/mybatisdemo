package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmpMapperTest extends AbstractMapperTest{
    @Test
    public void getEmp(){

        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmp(7369);
        Assert.assertNotNull(emp);
        System.out.println(emp);
    }
    @Test
    public void getList(){
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        List<Emp> empList=empMapper.getList();
        assertEquals(14,empList.size());
    }
    @Test
    public void insert(){
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=new Emp();
        emp.setEmpNo(8888);
        emp.setEName("liyiqi");
        emp.setDeptNo(30);
        emp.setJob("manager");
        int result=empMapper.insert(emp);
        assertEquals(1,result);
    }
    @Test
    public void update(){
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmp(8888);
        emp.setEName("kobe");
        int result=empMapper.update(emp);
        assertEquals(1,result);
    }
    @Test
    public void delete(){
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmp(8888);
        int result=empMapper.delete(8888);
        assertEquals(1,result);

    }
    @Test
    public void getCount(){
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        int count=empMapper.getCount();
        assertEquals(14,count);
    }



}
