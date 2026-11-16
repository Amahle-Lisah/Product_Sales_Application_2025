/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productsalesapplication;

/**
 *
 * @author Amahle Lisah Khumalo
 */
public interface IProductSales
{
    int[][] GetProductSales();

    int GetTotalSales();

    int GetSalesOverLimit();

    int GetSalesUnderLimit();

    int GetProductsProcessed();

    double GetAverageSales();
}
