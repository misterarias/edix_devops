def selection_sort(lista: list) -> list:
    if len(lista) < 2:
        return lista

    for i in range(len(lista)):
        index_minimum = i
        for j in range(i+1, len(lista)):
            if lista[j] < lista[index_minimum]:
                index_minimum = j

        lista[i], lista[index_minimum] = lista[index_minimum], lista[i]

    return lista
