package com.id.spi;


public interface IdService<T,E> {

    /**
     * 获取无序ID
     * @return
     */
    T getNoSeqId();

    /**
     * 批量获取无序ID
     * @param num 传入参数
     * @return
     */
    T[] getNoSeqIds(E num);

    /**
     * 获取有序ID
     * @return
     */
    T getSeqId();

    /**
     * 批量获取有序ID
     * @param num 传入参数
     * @return
     */
    T[] getSeqIds(E num);

}

