def valida_entradas(a, b):
    if a is None or b is None:
        raise RuntimeError('Invalid input')


def suma(a, b):
    valida_entradas(a, b)
    if a is None or b is None:
        raise RuntimeError('Invalid input')

    return a + b


def division(a, b):
    valida_entradas(a, b)
    return a / b
