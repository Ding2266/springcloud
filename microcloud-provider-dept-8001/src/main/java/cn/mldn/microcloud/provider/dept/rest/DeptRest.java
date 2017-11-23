package cn.mldn.microcloud.provider.dept.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.microcloud.Service.IDeptService;
import cn.mldn.microcloud.vo.Dept;

@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService ; 
	@PostMapping("/dept/add")
	public Object add(@RequestBody Dept dept) {
		return this.deptService.add(dept) ; 
	}
	@GetMapping("/dept/get/{deptno}")
	public Object get(@PathVariable("deptno") long deptno) {
		return this.deptService.get(deptno) ; 
	}
	@GetMapping("/dept/list")
	public Object list() {
		return this.deptService.list() ; 
	}
}
