class Solution:
    def split(self, word):
        return [char for char in word]

    def SplittedTrans(self, roman_num: str) -> int:
        int_num = 0
        if roman_num == 'I':
            int_num = 1
        elif roman_num == 'V':
            int_num = 5
        elif roman_num == 'X':
            int_num = 10
        elif roman_num == 'L':
            int_num = 50
        elif roman_num == 'C':
            int_num = 100
        elif roman_num == 'D':
            int_num = 500
        elif roman_num == 'M':
            int_num = 1000

        return int_num

    def romanToInt(self, s: str) -> int:
        string_list = self.split(s)
        sum = 0
        current_n = 0
        prev_n = 10000
        for rn in string_list:
            current_n = self.SplittedTrans(rn)
            if prev_n < current_n:
                sum -= prev_n*2
            sum += current_n
            prev_n = current_n

        return sum


# transer = Solution()
# print(transer.romanToInt('VII'))
# test = 'asd'
# print(test[1])
# print(test, type(test[0]))
