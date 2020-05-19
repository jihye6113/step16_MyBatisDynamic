package kosta.orm.repository;

import java.util.Arrays;

import kosta.orm.domain.Employees;

public class MainApp {

	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
//		// 1. 전체검색
//		dao.ifTest(null);
//		System.out.println("------------------------------------------------");
//		
//		// 2. last_name에 해당하는 레코드 검색
//		dao.ifTest(new Employees(0, "King", null, null, null, 0, null));
//		System.out.println("------------------------------------------------");
//		
//		// 3. job_id에 해당하는 레코드 검색
//		dao.ifTest(new Employees(0, null, null, null, "AD_VP", 0, null));
//		System.out.println("------------------------------------------------");
//		
//		// 4. last_name and job_id에 해당하는 레코드 검색
//		dao.ifTest(new Employees(0, "king", null, null, "AD_VP", 0, null));
		
		//////////////////////////////////////////////////////////////////////////
//		 1. last_name만 수정하기
//		dao.setTest(new Employees(300, "jihye", null, null, null, 0, null));
		
//		// 2. job_id만 수정하기
//		dao.setTest(new Employees(300, null, null, null, "HR_REP", 0, null));
//		
//		// 3. salary만 수정하기
//		dao.setTest(new Employees(300, null, null, null, null, 5500, null));
//		
//		// 4. last_name, salary 수정하기
//		dao.setTest(new Employees(300, "bbb", null, null, null, 9000, null));
//		
//		// 5. last_name, job_id만 수정하기
//		dao.setTest(new Employees(300, "ccc", null, null, "AD_VP", 0, null));
//		
//		// 6. last_name, job_id, salary 수정하기
//		dao.setTest(new Employees(300, "ddd", null, null, "AC_MGR", 9000, null));
		
		//////////////////////////////////////////////////////////////////////////
//		dao.forEach(Arrays.asList(100, 102, 103));
		
		dao.forEach(Arrays.asList(100));
	}
}