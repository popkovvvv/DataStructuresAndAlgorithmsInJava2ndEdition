package chapter11;

import base.items.Item;

/**
 * Сущность элемента данных
 *
 * @author rassoll
 * @created 12.02.2018
 * @$Author$
 * @$Revision$
 */
public class DataItem implements Item
{
	private int key;

	/**
	 * Конструктор
	 *
	 * @param key ключ
	 */
	public DataItem(int key)
	{
		this.key = key;
	}

	@Override
	public int getKey()
	{
		return key;
	}

	@Override
	public String getDisplayData()
	{
		return String.valueOf(key);
	}
}
