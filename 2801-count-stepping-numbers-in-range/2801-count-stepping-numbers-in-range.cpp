class Solution {
public:
    const int MOD = 1e9 + 7;
    int dp[105][11][2][2];
    vector<int>digits;
    int dfs(int pos,int prev, int tight, int leadingZero){
        if(pos == (int)digits.size()){
            return 1;
        }
        int &res = dp[pos][prev][tight][leadingZero];
        if(res != -1) return res;
        res = 0;
        int limit = tight ? digits[pos] : 9;
        for(int i = 0; i <= limit; i++){
            if(!leadingZero && (abs(prev - i) != 1)) continue;
            int nxtTight = tight && (i == digits[pos]);
            int nxtLeadingZero = leadingZero && (i == 0);
            int nxtDig;
            if(nxtLeadingZero){nxtDig = 10;}
            else nxtDig = i;
            res += dfs(pos+1,nxtDig,nxtTight,nxtLeadingZero);
            res %= MOD;
        }
        return res;
    }
    int count(string num){
        digits.clear();
        for(auto ch : num){
            digits.push_back(ch-'0');
        }
        memset(dp,-1,sizeof(dp));
        return dfs(0,10,1,1);
    }
    string subOne(string s){
        int i = (int)s.size() - 1;
        while(i >= 0 && s[i] == '0'){
            s[i--] = '9';
        }
        if(i >= 0){
            s[i]--;
        }
         int firstNonZero = 0;
        while (firstNonZero < s.length() && s[firstNonZero] == '0') {
            firstNonZero++;
        }
        if (firstNonZero == s.length()) return "0"; 
        return s.substr(firstNonZero);
    }
    int countSteppingNumbers(string low, string high) {
        return (count(high) - count(subOne(low)) + MOD)%MOD;
    }
};