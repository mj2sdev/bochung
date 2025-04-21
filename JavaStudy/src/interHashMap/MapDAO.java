package interHashMap;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDAO {
	// DB와 연동하여 CRUD 작업을 처리하는 메서드의 집합 클래스
	Scanner scanner = new Scanner(System.in);
	
	Map<Integer, MapDTO> map = new HashMap<>();
	
	DecimalFormat format = new DecimalFormat("###,###,##0");
	
	public void insertView() {
		System.out.print("id : ");
		int id = scanner.nextInt();
		System.out.print("name : ");
		String name = scanner.next();
		System.out.print("grade [1]bujang [2]chajang [3]gwajang : ");
		int grade = scanner.nextInt();
		
		int salary = 6000000 - (grade * 1000000);
		int bonus = (int)(salary * .1);
		int pay = salary + bonus;
		
		var dto = new MapDTO();
		dto
			.setId(id)
			.setName(name)
			.setGrade(grade)
			.setBonus(bonus)
			.setPay(pay)
			.setSalary(salary);
		
		map.put(id, dto);
	}
	
	public void getMapById() {
		int totalPay = 0;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxId = 0;
		int minId = 0;
		
		for (Integer key : map.keySet()) {
			var dto = map.get(key);
			
			if (max < dto.getPay()) {
				maxId = dto.getId();
				max = dto.getPay();
			}
			
			if (min > dto.getPay()) {
				minId = dto.getId();
				min = dto.getPay();
			}
			
			this.print(dto);
			
			totalPay += dto.getPay();
		}
		
		System.out.println("총지급액 : W " + format.format(totalPay));
		System.out.println("최소 급여액 사원 번호 : " + minId);
		System.out.println("최대 급여액 사원 번호 : " + maxId);
	}
	
	
	public void getDtoById(int id) {
		MapDTO findedDto = this.findById(id);
		if (findedDto != null)
			this.print(findedDto);
	}
	
	
	public boolean deleteDtoById(int id) {
		MapDTO findedDto = findById(id);
		
		if (findedDto == null) return false;
		
		map.remove(id);
		return true;
	}
	
	private MapDTO findById(int id) {
		MapDTO findedDto = null;
		for (int key : map.keySet()) {
			MapDTO dto = map.get(key);
			if (dto.getId() == id)
				findedDto = dto;
		}
		return findedDto;
	}
	private void print(MapDTO dto) {
		Map<Integer, String> gradeMap = new HashMap<>();
		gradeMap.put(1, "bu");
		gradeMap.put(2, "cha");
		gradeMap.put(3, "gwa");
		
		System.out.print(dto.getId() + "\t");
		System.out.print(dto.getName() + "\t");
		System.out.print(gradeMap.get(dto.getGrade()) + "\t");
		System.out.print("W " + format.format(dto.getSalary()) + "\t");
		System.out.print("W " + format.format(dto.getBonus()) + "\t");
		System.out.print("W " + format.format(dto.getPay()) + "\t\n");
	}

	public boolean modifyById(int modifyId) {
		MapDTO findedDto = findById(modifyId);
		if (findedDto == null)
		return false;
		
		System.out.print("grade [1]bujang [2]chajang [3]gwajang : ");
		int grade = scanner.nextInt();
		int salary = 6000000 - (grade * 1000000);
		int bonus = (int)(salary * .1);
		int pay = salary + bonus;
		
		findedDto.setGrade(grade)
			.setBonus(bonus)
			.setSalary(salary)
			.setPay(pay);
		return true;
	}
}
