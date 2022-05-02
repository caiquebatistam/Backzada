package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;



/**
 * Programinha basico pra fortalecer o pae no aprendizado, lê dados
 * de entrada e armazena em uma lista, separei as classes em duas entidades
 * Empregado e Empregado tercerizado com regras de negócio diferentes.
 * <p>
 * Como o programa é apenas para fortalecer os fundamentos e esta relativamente pequeno,
 * optei por não utilizar o design patterns MVC.
 * 
 * @author Caique.Batista
 *
 */
public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Entre com o numero de funcionarios: ");
		
		int func = sc.nextInt();
		
		
		for (int i=1; i <= func ; i++) {
			
			System.out.println("Employee " + i + " data: ");
			
			System.out.print("Funcionario é tercerizado (y/n) ? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name : ");
			sc.nextLine(); // pra consumir a quebra de linha
			String name = sc.nextLine();
			
			System.out.println("Horas : ");
			int hours = sc.nextInt();
			
			System.out.println("Valor por hora : ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				
				System.out.print("Cobrança adicional : ");
				double additionalCharge = sc.nextDouble();
				
				Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				
				/*
				 * Pode ser feita tbm da seguinte forma :
				 * 
				 * list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
				 */
				list.add(emp);
			
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}
		System.out.println();
		System.out.println("Pagamento da rapaziada : ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
		
		
		
		
		
		
	}

}
