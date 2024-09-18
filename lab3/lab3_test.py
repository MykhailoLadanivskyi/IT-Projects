import unittest
from lab3 import calculate_sum  # Заміни "your_module" на ім'я файлу, де знаходиться твоя функція.

class TestCalculateSum(unittest.TestCase):
    def test_valid_input(self):
        # Перевірка з правильними числами
        result = calculate_sum(5, 10, 2)
        self.assertEqual(result, 17)

    def test_invalid_input(self):
        # Перевірка з некоректними значеннями
        result = calculate_sum(5, 'abc', 2)
        self.assertEqual(result, 'You should input numbers!')

if __name__ == '__main__':
    unittest.main()
