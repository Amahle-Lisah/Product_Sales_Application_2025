/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesapplication;

/**
 *
 * @author Amahle Lisah Khumalo
 */
public class ProductSales implements IProductSales
{
    private static final int SALES_LIMIT = 500;

    private final int[][] productSales =
    {
        {300, 150, 700},
        {250, 200, 600}
    };

    @Override
    public int[][] GetProductSales()
    {
        return productSales;
    }

    @Override
    public int GetTotalSales()
    {
        int total = 0;

        for (int[] year : productSales)
        {
            for (int sale : year)
            {
                total += sale;
            }
        }

        return total;
    }

    @Override
    public double GetAverageSales()
    {
        int numberOfSales = 0;

        for (int[] year : productSales)
        {
            numberOfSales += year.length;
        }

        return (double) GetTotalSales() / numberOfSales;
    }

    @Override
    public int GetSalesOverLimit()
    {
        int salesOverLimit = 0;

        for (int[] year : productSales)
        {
            for (int sale : year)
            {
                if (sale > SALES_LIMIT)
                {
                    salesOverLimit++;
                }
            }
        }

        return salesOverLimit;
    }

    @Override
    public int GetSalesUnderLimit()
    {
        int salesUnderLimit = 0;

        for (int[] year : productSales)
        {
            for (int sale : year)
            {
                if (sale < SALES_LIMIT)
                {
                    salesUnderLimit++;
                }
            }
        }

        return salesUnderLimit;
    }

    @Override
    public int GetProductsProcessed()
    {
        return productSales.length;
    }
}