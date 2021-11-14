package sorting;

import java.util.Arrays;

class SelectionSort {
    public static int[] selectionSort(int[] lista) {
        if (lista.length < 2) {
            return lista;
        }

        for (int i = 0; i < lista.length; i++) {
            int min_i = i;
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[min_i]) {
                    min_i = j;
                }
            }
            int tmp = lista[i];
            lista[i] = lista[min_i];
            lista[min_i] = tmp;
        }
        return lista;
    }
}
