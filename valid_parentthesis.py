class Solution(object):
    def isValid(self, s):
        self.s = s
        while('()' in s or '[]' in s or '{}' in s):
            s = s.replace('()', '').replace('[]', '').replace('{}', '')
        if(len(s)!=0):
            return False
        else:
            return True