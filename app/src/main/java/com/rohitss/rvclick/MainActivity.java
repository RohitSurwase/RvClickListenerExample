package com.rohitss.rvclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<TestItem> mTestItemList;
    private View.OnClickListener onItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //TODO: Step 4 of 4: Finally call getTag() on the view.
            // This viewHolder will have all required values.
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            int position = viewHolder.getAdapterPosition();
            // viewHolder.getItemId();
            // viewHolder.getItemViewType();
            // viewHolder.itemView;
            TestItem thisItem = mTestItemList.get(position);
            Toast.makeText(MainActivity.this, "You Clicked: " + thisItem.getTitle(), Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        initDummyData();

        MyRecyclerAdapter recyclerViewAdapter = new MyRecyclerAdapter(mTestItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
        //TODO: Step 1 of 4: Create and set OnItemClickListener to the adapter.
        recyclerViewAdapter.setOnItemClickListener(onItemClickListener);

    }

    private void initDummyData() {
        mTestItemList = new ArrayList<>();
        TestItem testItem;

        testItem = new TestItem("Test Item 1", "This is test item 1");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 2", "This is test item 2");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 3", "This is test item 3");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 4", "This is test item 4");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 5", "This is test item 5");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 6", "This is test item 6");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 7", "This is test item 7");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 8", "This is test item 8");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 9", "This is test item 9");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 10", "This is test item 10");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 11", "This is test item 11");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 12", "This is test item 12");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 13", "This is test item 13");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 14", "This is test item 14");
        mTestItemList.add(testItem);

        testItem = new TestItem("Test Item 15", "This is test item 15");
        mTestItemList.add(testItem);
    }
}
