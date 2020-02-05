package edu.psu.jbr5410.bigo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //String[] operations = {"Get Min", "Insert", "Search"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonClick(View view) {
        EditText editEmailAddress = (EditText) findViewById(R.id.emailAddress);
        String emailAddress = editEmailAddress.getText().toString();

        EditText editEmailSubject = (EditText) findViewById(R.id.emailSubject);
        String emailSubject = editEmailSubject.getText().toString();

        TextView textAddress = findViewById(R.id.addressText);
        textAddress.setText(emailAddress);

        TextView textSubject = findViewById(R.id.subtext);
        textSubject.setText(emailSubject);

        Spinner dataStructureSpinner = findViewById(R.id.dataStructureSpinner);
        String dataStructure = dataStructureSpinner.getSelectedItem().toString();

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int radioId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedButton = (RadioButton) findViewById(radioId);
        String caseText = selectedButton.getText().toString();

        String emailBody = caseText + " Time complexity for " + dataStructure;

        TextView textBody = findViewById(R.id.textBody);

        CheckBox getMinCheck = (CheckBox) findViewById(R.id.getMin);
        CheckBox insertCheck = (CheckBox) findViewById(R.id.insert);
        CheckBox searchCheck = (CheckBox) findViewById(R.id.search);

        if (getMinCheck.isChecked()) {
            emailBody = emailBody + "\n Get Min: ";

            if (dataStructure.equals("2-3 Tree")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(logn)";
                } else {
                    emailBody = emailBody + "O(logn)";
                }
            }
            else if (dataStructure.equals("Binary Search Tree")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(logn)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Hash Table")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(n)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Linked List")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(n)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Min Heap")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(1)";
                } else {
                    emailBody = emailBody + "O(1)";
                }
            }
        }

        if (insertCheck.isChecked()) {
            emailBody = emailBody + "\n Insert: ";

            if (dataStructure.equals("2-3 Tree")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(logn)";
                } else {
                    emailBody = emailBody + "O(logn)";
                }
            }
            else if (dataStructure.equals("Binary Search Tree")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(logn)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Hash Table")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(1)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Linked List")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(l)";
                } else {
                    emailBody = emailBody + "O(l)";
                }
            }
            else if (dataStructure.equals("Min Heap")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(logn)";
                } else {
                    emailBody = emailBody + "O(logn)";
                }
            }
        }

        if (searchCheck.isChecked()) {
            emailBody = emailBody + "\n Search: ";

            if (dataStructure.equals("2-3 Tree")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(logn)";
                } else {
                    emailBody = emailBody + "O(logn)";
                }
            }
            else if (dataStructure.equals("Binary Search Tree")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(logn)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Hash Table")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(1)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Linked List")) {
                if (caseText.equals("Average Case")) {
                    emailBody = emailBody + "O(n)";
                } else {
                    emailBody = emailBody + "O(n)";
                }
            }
            else if (dataStructure.equals("Min Heap")) {
                if (caseText.equals("Average Case")) {

                }
            }
        }

        textBody.setText(emailBody);


    }
}
