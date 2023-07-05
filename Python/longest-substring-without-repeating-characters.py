'''
https://leetcode.com/problems/longest-substring-without-repeating-characters/

Medium
'''
class Solution1:
    # add each letter one by one in to a list, see if it is added before
    # choose the longest sub-list
    def lengthOfLongestSubstring(self, s: str) -> int:
        # change the str to list
        slist = list(s)
        # r_slist is used to store the back part
        r_slist = slist
        # the longest length is what we will return
        length = 0
        for l in slist:
            # temp is used to store current sub-list
            temp = [l]
            r_slist.remove(l)
            for ll in r_slist:
                if ll not in temp:
                    temp.append(ll)
                else:
                    break
            print(temp)
            print(r_slist)
            length = len(temp) if len(temp) > length else length
            print(length)

        return length

test = Solution1()
test.lengthOfLongestSubstring("bbtablud")