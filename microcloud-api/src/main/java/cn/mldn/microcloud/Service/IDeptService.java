package cn.mldn.microcloud.Service;

import java.util.List;

import cn.mldn.microcloud.vo.Dept;

public interface IDeptService {
	public boolean add(Dept dept) ;
	public Dept get(Long deptno) ; 
	public List<Dept> list() ; 
}
