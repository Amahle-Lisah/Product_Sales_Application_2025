package com.mycompany.productsalesapplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Amahle Lisah Khumalo
 */
public class ProductSalesTest
{
    private ProductSales sales;

    public ProductSalesTest()
    {
    }         

    @BeforeAll
    public static void setUpClass()
    {
    }

    @AfterAll
    public static void tearDownClass()
    {
    }

    @BeforeEach
    public void setUp()
    {
        sales = new ProductSales();
    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales()
    {
        assertEquals(2, sales.GetSalesOverLimit());
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales()
    {
        assertEquals(4, sales.GetSalesUnderLimit());
    }
}