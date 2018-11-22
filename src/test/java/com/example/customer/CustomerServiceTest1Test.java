package com.example.customer;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.example.customer.Model.Customer;
import com.example.customer.Repository.CustomerRepository;
import com.example.customer.Service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest1Test {

    CustomerRepository customerRepository;

    @Test
    public void testFindTheGreatestFromAllData() {
        //when(dataServiceMock.retrieveCustomer()).thenReturn(new Customer(1));
        //assertEquals(24, businessImpl.findAll());
        Customer cus =  new Customer();
        System.out.print(cus.toString());
        System.out.print("test");


    }

   /* @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
        assertEquals(15, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    } */
}