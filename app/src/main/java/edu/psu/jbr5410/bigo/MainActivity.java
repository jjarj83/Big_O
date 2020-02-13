package edu.psu.jbr5410.bigo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.MenuInflater;
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
    int menuClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final Spinner dataStructureSpinner = findViewById(R.id.dataStructureSpinner);
        dataStructureSpinner.setSelection(1);


        switch (item.getItemId()) {
            case R.id.menu_compose:
                if (menuClicks % 2 == 0) {
                    item.setIcon(R.drawable.ic_email_black_24dp);
                    EditText editEmailAddress = (EditText) findViewById(R.id.emailAddress);
                    String emailAddress = editEmailAddress.getText().toString();

                    EditText editEmailSubject = (EditText) findViewById(R.id.emailSubject);
                    String emailSubject = editEmailSubject.getText().toString();

                    TextView textAddress = findViewById(R.id.addressText);
                    textAddress.setText(emailAddress);

                    TextView textSubject = findViewById(R.id.subtext);
                    textSubject.setText(emailSubject);

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
                else if (menuClicks % 2 == 1) {
                    item.setIcon(R.drawable.ic_edit_black_24dp);
                    TextView textBody = findViewById(R.id.textBody);
                    TextView textSubject = findViewById(R.id.subtext);
                    TextView textAddress = findViewById(R.id.addressText);

                    String emailAddress = textAddress.toString();
                    String emailSubject = textSubject.toString();
                    String emailBody = textBody.toString();


                    Intent intent = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto",
                            emailAddress, null));

                    intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
                    intent.putExtra(Intent.EXTRA_TEXT, emailBody);

                    try {
                        startActivity(intent);
                    }
                    catch (android.content.ActivityNotFoundException ex) {
                        Log.e("MyActivity", "There is no email client installed.");
                    }

                }
                menuClicks++;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
