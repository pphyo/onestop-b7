package com.jdc.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.function.Executable;

import com.jdc.app.main.AppService;
import com.jdc.app.main.Message;

@TestMethodOrder(OrderAnnotation.class)
public class MessageCrudTest {
	
	static AppService service; 
	
	@Test
	@Order(1)
	@DisplayName("Test for create message")
	void test1() {
		Message message = new Message();
		message.setId(1);
		message.setMessage("Srr pee p lr");
		message.setOwner("Min Khant Thu");
		message.setSendAt(LocalDate.of(2022, 10, 10));
		
		service.create(message);
		
		assertEquals(1, service.size());
		
	}
	
	@Test
	@Order(2)
	@DisplayName("Test for Find By Id")
	void test2() {
		Message message = service.findById(1);
		assertNotNull(message);
		assertEquals(1, message.getId());
		assertEquals("Srr pee p lr", message.getMessage());
		assertEquals("Min Khant Thu", message.getOwner());
		assertEquals(LocalDate.of(2022, 10, 10), message.getSendAt());
		
		Message obj = service.findById(2);
//		assertNull(obj);
		
		Executable exec = new Executable() {
			@Override
			public void execute() throws Throwable {
				obj.getMessage();				
			}
		};
		assertThrows(NullPointerException.class, exec);
	}
	
	@BeforeAll
	static void start() {
		service = new AppService();
		System.out.println("Before All");
	}
	
	@AfterAll
	static void end() {
		System.out.println("After All");
	}
	
	@BeforeEach
	void init() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	void shutdown() {
		System.out.println("After Each");
	}
	
}
