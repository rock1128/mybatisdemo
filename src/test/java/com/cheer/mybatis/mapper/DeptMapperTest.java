package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Dept;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class DeptMapperTest extends AbstractMapperTest{
    @Test
    public void getDept(){
        DeptMapper deptMapper=session.getMapper(DeptMapper.class);
        Dept dept=deptMapper.getDept(10);
    }
    @Test
    public void getList(){
        DeptMapper deptMapper=session.getMapper(DeptMapper.class);
        List<Dept> deptList=deptMapper.getList();

    }
    @Test
    public void insert(){
        DeptMapper deptMapper=session.getMapper(DeptMapper.class);
        Dept dept=new Dept();
        dept.setDeptNo(50);
        dept.setdName("liyiqi");
        dept.setLoc("beijing");
        int result=deptMapper.insert(dept);
        assertEquals(1,result);

    }
    @Test
    public void update(){
        DeptMapper deptMapper=session.getMapper(DeptMapper.class);
        Dept dept=deptMapper.getDept(70);
        dept.setdName("zhugaoping");
        int result=deptMapper.update(dept);
        assertEquals(1,result);
    }
    @Test
    public void delete(){
        DeptMapper deptMapper=session.getMapper(DeptMapper.class);
        int result=deptMapper.delete(50);
        assertEquals(1,result);
    }
    @Test
    public void getCount(){
        DeptMapper deptMapper=session.getMapper(DeptMapper.class);
        int count=deptMapper.getCount();
        assertEquals(7,count);

    }








}
