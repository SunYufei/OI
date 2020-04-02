/*
 * @lc app=leetcode.cn id=289 lang=cpp
 *
 * [289] 生命游戏
 */
#include <bits/stdc++.h>
using namespace std;

// @lc code=start
class Solution {
  public:
    void gameOfLife(vector<vector<int>> &board) {
        int dx[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        int dy[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        for (int i = 0; i < board.size(); i++)
            for (int j = 0; j < board[0].size(); j++) {
                int sum = 0;
                for (int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < board.size() && ny >= 0 &&
                        ny < board[0].size())
                        sum += (board[nx][ny] & 1);
                }
                if (board[i][j] == 1) {
                    if (sum == 2 || sum == 3)
                        board[i][j] |= 2;
                } else {
                    if (sum == 3)
                        board[i][j] |= 2;
                }
            }
        for (int i = 0; i < board.size(); i++)
            for (int j = 0; j < board[0].size(); j++)
                board[i][j] >>= 1;
    }
};
// @lc code=end
