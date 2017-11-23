package cn.mldn.microcloud.provider.dept.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.microcloud.Service.IDeptService;
import cn.mldn.microcloud.vo.Dept;

@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService ; 
	@GetMapping("/dept/add")
	public Object add(Dept dept) {
		return this.deptService.add(dept) ; 
	}
	@GetMapping("/dept/get")
	public Object get(long deptno) {
		return this.deptService.get(deptno) ; 
	}
	@GetMapping("/dept/list")
	public Object list() {
		return this.deptService.list() ; 
	}
}
