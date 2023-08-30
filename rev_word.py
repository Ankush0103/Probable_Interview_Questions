class Solution(object):
    def reverseWords(self, s):
        self.s = s
        l = s.split()
        l.reverse()
        return ' '.join(l)