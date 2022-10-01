public class time {
    static int parity(int a)
    {
        return a % 2;
    }

    static int solve(int []array, int size)
    {
        int operations = 0;
        for (int i = 0; i < size - 1; i++)
        {

            // Operation needs to be performed
            if (parity(array[i]) == parity(array[i + 1]))
            {

                operations++;
                if (i + 2 < size)
                {

                    // Parity of previous element
                    int pari1 = parity(array[i]);

                    // Parity of next element
                    int pari2 = parity(array[i + 2]);

                    // Update parity of current
                    // element to be other than
                    // the parities of the previous
                    // and the next number
                    if (pari1 == pari2)
                    {
                        if (pari1 == 0)
                            array[i + 1] = 1;
                        else if (pari1 == 1)
                            array[i + 1] = 0;
                        else
                            array[i + 1] = 1;
                    }
                    else
                    {
                        if ((pari1 == 0 && pari2 == 1) ||
                                (pari1 == 1 && pari2 == 0))
                            array[i + 1] = 2;
                        if ((pari1 == 1 && pari2 == 2)
                                || (pari1 == 2 && pari2 == 1))
                            array[i + 1] = 0;
                        if ((pari1 == 2 && pari2 == 0)
                                || (pari1 == 0 && pari2 == 2))
                            array[i + 1] = 1;
                    }
                }
            }
        }

        return operations;
    }
    public static void main(String args[]){

    }
}
