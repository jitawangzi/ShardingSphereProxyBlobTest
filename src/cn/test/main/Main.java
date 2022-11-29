package cn.test.main;

import java.util.Arrays;
import java.util.UUID;

import cn.test.main.domain.DataRecord;
import cn.test.main.mapper.DataRecordMapper;
import cn.test.main.util.SpringContextLoader;

public class Main {

	public static void main(String[] args) throws Exception {
		SpringContextLoader.start("applicationContext.xml");
		DataRecordMapper mapper = SpringContextLoader.getContext().getBean(DataRecordMapper.class);

		DataRecord record = new DataRecord();
		byte[] oriArray = new byte[] { 1, 0, 99, 111, 109, 46, 108, 115, 46, 114, 112, 99, 46, 115, 101, 114, 118, 101, 114, 46, 82,
				112, 99, 82, 101, 113, 117, 101, 115, -12, 49, 48, 46, 48, 46, 52, 46, 49, -75, 75, 74, 65, 104, 115, 100, 97, 107, 100,
				104, 97, 115, 107, -28, 115, 101, 116, 68, 97, 116, -31, 1, 1, 91, 76, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 79,
				98, 106, 101, 99, 116, -69, 6, 9, -64, -39, -86, 20, 3, 115, 100, 104, 98, 115, 97, 104, 100, 98, 115, -31, 1, 2, 99,
				111, 109, 46, 108, 115, 46, 114, 112, 99, 46, 115, 101, 114, 118, 101, 114, 46, 82, 112, 99, 82, 101, 115, 112, 111,
				110, 115, -27, 0, 0, 0, 3, 115, 107, 104, 100, 98, 115, 107, 100, 117, 104, 97, 108, 100, 115, 106, 102, 100, 107, 106,
				97, 102, 110, 97, 100, 102, -22, 10, 66, 61, -8, -5, 108, 25, 0, 0, 3, 2, 0, 3, 0, 0 };
		record.setBlobData(oriArray);
		record.setIntData(-1);
		// If  set this, will cause an exception : Data truncation: Out of range value
		record.setShortData((short) 5);
		record.setByteData((byte) 15);

		record.setUuid(UUID.randomUUID().toString());
		mapper.insert(record);

		DataRecord recordSelect = mapper.selectByPrimaryKey(record.getUuid());
		System.out.println();
		System.out.println("binary data equals result : " + Arrays.equals(record.getBlobData(), recordSelect.getBlobData()));
		System.out.println();
		System.out.println("int data equals result : " + record.getIntData().equals(recordSelect.getIntData()));

		Thread.currentThread().join();

	}
}
