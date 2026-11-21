package com.mycompany.productsalesapplication;

/**
 * This class stores product sales figures in a two-dimensional array and calculates
 * totals, averages and how many sales are over or under the sales limit.
 *  It also implements the IProductSales interface.
 *
 * @author Amahle Lisah Khumalo
 */
public class ProductSales implements IProductSales
{
    // The sales limit used to compare each sale against.
    // It is static and final, so it is shared and can never change.
    private static final int SALES_LIMIT = 500;

    // Two-dimensional array of sales figures.
    // Each inner array is one row of sales data.
    private final int[][] productSales =
    {
        {300, 150, 700},
        {250, 200, 600}
    };

    // Returns the whole sales array so other classes can read it
    @Override
    public int[][] GetProductSales()
    {
        return productSales;
    }

    // Adds up every sale in the array and returns the total
    @Override
    public int GetTotalSales()
    {
        int total = 0;

        // Outer loop goes through each row of the array
        for (int[] year : productSales)
        {
            // Inner loop goes through each sale in that row
            for (int sale : year)
            {
                total += sale; // adds the sale to the running total
            }
        }

        return total;
    }

    // Calculates the average sale: total sales divided by the number of sales
    @Override
    public double GetAverageSales()
    {
        int numberOfSales = 0;

        // Count how many individual sales figures there are in the array
        for (int[] year : productSales)
        {
            numberOfSales += year.length;
        }

        // Cast to double so the division keeps its decimal places
        return (double) GetTotalSales() / numberOfSales;
    }

    // Counts how many sales are greater than the sales limit
    @Override
    public int GetSalesOverLimit()
    {
        int salesOverLimit = 0;

        for (int[] year : productSales)
        {
            for (int sale : year)
            {
                // Only sales strictly above the limit are counted
                if (sale > SALES_LIMIT)
                {
                    salesOverLimit++;
                }
            }
        }

        return salesOverLimit;
    }

    // Counts how many sales are less than the sales limit
    @Override
    public int GetSalesUnderLimit()
    {
        int salesUnderLimit = 0;

        for (int[] year : productSales)
        {
            for (int sale : year)
            {
                // Only sales strictly below the limit are counted.
                // A sale exactly equal to the limit is not counted here.
                if (sale < SALES_LIMIT)
                {
                    salesUnderLimit++;
                }
            }
        } //end of loop

        return salesUnderLimit;
    }

    // Returns the number of rows in the sales array
    @Override
    public int GetProductsProcessed()
    {
        return productSales.length;
    }
} //End of class