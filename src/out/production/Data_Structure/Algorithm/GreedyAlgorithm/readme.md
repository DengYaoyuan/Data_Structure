### 贪心算法

##### 说明
贪心算法是使所做的选择看起来都是当前最佳的，期望通过所做的局部最优选择来产生一个全局最优解。

##### 设计贪心算法的步骤
1. 将优化问题转换成这样一个问题，即先做出选择，再解决剩下的一个子问题。
2. 证明原问题总是有一个最优解是贪心选择的得到的，从而说明贪心选择的安全。
3. 说明在做出贪心选择后，剩下的子问题具有这样一个性质。即如果将子问题的最优解和我们所做的贪心选择联合起来，可以得到一个更加负责的动态规划解。