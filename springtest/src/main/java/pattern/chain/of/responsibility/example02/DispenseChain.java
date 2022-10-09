package pattern.chain.of.responsibility.example02;

/**
 * 定义责任链中下一个处理器和处理请求方法
 */
public interface DispenseChain {
	/**
	 * 下一个处理链
	 * @param nextChain
	 */
	void setNextChain(DispenseChain nextChain);

	/**
	 * 处理方法
	 * @param cur
	 */
	void dispense(Currency cur);
}
