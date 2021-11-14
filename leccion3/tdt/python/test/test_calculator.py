from calculator import calculator

import pytest


def test_suma():
    assert calculator.suma(1, 1) == 2
    assert calculator.suma(1.5, 1.5) == 3
    assert calculator.suma('a', 'b') == 'ab'

    with pytest.raises(RuntimeError):
        calculator.suma(None, 1)

    with pytest.raises(RuntimeError):
        calculator.suma(1, None)


def test_division():
    assert calculator.division(2, 4) == 0.5
    with pytest.raises(RuntimeError):
        calculator.division(None, 1)

    with pytest.raises(RuntimeError):
        calculator.division(1, None)

    assert calculator.division(1, 3) == 0.333
