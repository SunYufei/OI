/*
    卡片换位

    你玩过华容道的游戏吗？
    这是个类似的，但更简单的游戏。
    看下面 3 x 2 的格子

    +---+---+---+
    | A | * | * |
    +---+---+---+
    | B |   | * |
    +---+---+---+

    在其中放5张牌，其中A代表关羽，B代表张飞，* 代表士兵。
    还有一个格子是空着的。

    你可以把一张牌移动到相邻的空格中去(对角不算相邻)。
    游戏的目标是：关羽和张飞交换位置，其它的牌随便在哪里都可以。

    输入格式：
    输入两行6个字符表示当前的局面

    输出格式：
    一个整数，表示最少多少步，才能把AB换位（其它牌位置随意）

    例如，输入：
    * A
    **B

    程序应该输出：
    17

    再例如，输入：
    A B
    ***

    程序应该输出：
    12


    资源约定：
    峰值内存消耗 < 256M
    CPU消耗  < 1000ms

    请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

    所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。

    注意: main函数需要返回0
    注意: 只使用ANSI C/ANSI C++
   标准，不要调用依赖于编译环境或操作系统的特殊函数。
    注意: 所有依赖的函数必须明确地在源文件中 #include <xxx>，
   不能通过工程设置而省略常用头文件。

    提交时，注意选择所期望的编译器类型。
*/
#include <cstring>
#include <iostream>
#include <string>
using namespace std;

int ans = 0x3f3f3f3f;
bool v[3][3][3][3][3][3];

void dfs(int x1, int y1, int x2, int y2, int x, int y, int step) {
    if (step > ans)
        return;
}

int main() {
    int i, j;
    int ax, ay, bx, by, sx, sy;
    string s;

    for (i = 0; i < 2; i++) {
        getline(cin, s);
        for (j = 0; j < 3; j++) {
            if (s[j] == ' ') {
                sx = i;
                sy = j;
            } else if (s[j] == 'A') {
                ax = i;
                ay = j;
            } else if (s[j] == 'B') {
                bx = i;
                by = j;
            } else
                continue;
        }
    }
    memset(v, false, sizeof(v));
    dfs(ax, ay, bx, by, sx, sy, 0);
    cout << ans << endl;
    return 0;
}