package empProj.controller;

import empProj.dao.EmpDao;
import java.util.*;
import empProj.vo.*;


public class EmpController {
	private EmpDao eDao;
	
	public EmpController() {
		eDao = new EmpDao();
		
		ArrayList<EmpVO> list = eDao.getAll();
		for(EmpVO e : list) {
			System.out.println(e);
		}
		System.out.println("=======================================");
		// 20번 부서번호를 입력해서 부서원들의 정보를 조회
		ArrayList<EmpVO> list1 = eDao.getDnoInfo(20);
		for(EmpVO e1 : list1) {
			System.out.println(e1);
		}
		System.out.println("=======================================");
		// SALESMAN 직급을 가진 사원들의 정보 조회
		ArrayList<EmpVO> list2 = eDao.getJobInfo("MANAGER");
		for(EmpVO e2 : list2) {
			System.out.println(e2);
		}
		
		
	}

	public static void main(String[] args) {
		new EmpController();
	}

}
