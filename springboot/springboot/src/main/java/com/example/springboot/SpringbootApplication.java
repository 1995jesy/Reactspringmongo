package com.example.springboot;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

@SpringBootApplication
@EnableSwagger2
public class SpringbootApplication implements CommandLineRunner{

	
    @Autowired
    private StudentRepository studentrepository;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       
		Student S1 = new Student("R-001","Gladis", null, 2012,"II","A","MALE");
		Student S2 = new Student ("R-002", "jessy", null, 2015, "II","A","MALE");
		Student S3 = new Student("R-003", "sugantha", null, 2013,"II","A","MALE");
		Student S4 = new Student("R-004", "kalai",  null, 2014,"II","B","FMALE");
		Student S5 = new Student("R-005", "daliya",  null, 2015,"I","c","FEMALE");
		
		studentrepository.save(S1);
		studentrepository.save(S2);
		studentrepository.save(S3);
		studentrepository.save(S4);
		studentrepository.save(S5);
		
		
	    System.out.print("***********");
	    List<Student> student =studentrepository.findAll();
	    for (Student S : student) {
		System.out.println(S.toString());
	 }
		 
	}
}