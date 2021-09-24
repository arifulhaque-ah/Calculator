package com.arif.calculator.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.arif.calculator.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    TextView one, two, three, four, five, six, seven, eight, nine, point, zero;
    TextView clear, tvResultClear, divide, add, subtract, multiply, equal, minusValue, textView, tvResult;
    ImageView delete;
    String ans = "";
    ArrayList<Integer> a = new ArrayList<Integer>();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //Numbers
        one = root.findViewById(R.id.StOne);
        two = root.findViewById(R.id.StTwo);
        three = root.findViewById(R.id.StThree);
        four = root.findViewById(R.id.tvFour);
        five = root.findViewById(R.id.StFive);
        six = root.findViewById(R.id.StSix);
        seven = root.findViewById(R.id.StSeven);
        eight = root.findViewById(R.id.StEight);
        nine = root.findViewById(R.id.StNine);
        zero = root.findViewById(R.id.StZero);
        //Operators
        add = root.findViewById(R.id.StPlus);
        subtract = root.findViewById(R.id.StMinus);
        multiply = root.findViewById(R.id.StMul);
        divide = root.findViewById(R.id.StDivide);
        point = root.findViewById(R.id.StDot);
        equal = root.findViewById(R.id.StEquals);
        minusValue = root.findViewById(R.id.tvPositiveNegative);
        tvResult = root.findViewById(R.id.StResult);
        textView = root.findViewById(R.id.StExpression);
        clear = root.findViewById(R.id.tvC);
        delete = root.findViewById(R.id.StBack);
        tvResultClear = root.findViewById(R.id.StClear);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "1";
                textView.setText(textView.getText() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "2";

                textView.setText(textView.getText() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "3";

                textView.setText(textView.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "4";

                textView.setText(textView.getText() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "5";

                textView.setText(textView.getText() + "5");

            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "6";

                textView.setText(textView.getText() + "6");

            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "7";

                textView.setText(textView.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "8";

                textView.setText(textView.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "9";

                textView.setText(textView.getText() + "9");

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!textView.getText().toString().isEmpty()) {
                    String s = textView.getText().toString();
                    char ch = s.charAt(s.length() - 1);
                    if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                        ans += ".";
                        textView.setText(textView.getText() + ".");
                    }

                }


            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans += "0";

                textView.setText(textView.getText() + "0");

            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = "";
                textView.setText(null);
                tvResult.setText(null);
                a.clear();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().isEmpty()) {
                    String s = textView.getText().toString();
                    //ans=ans.substring(0,ans.length());
                    String s1 = "";
                    for (int i = 0; i < s.length() - 1; i++) {
                        s1 += s.charAt(i);
                    }
                    //ans=ans.substring(0,s.length()-1);
                    ans = s1;
                    textView.setText(s1);
                }

            }
        });
        tvResultClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = "";
                tvResult.setText(null);
                a.clear();
            }
        });

        minusValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText().toString();
                double res = Double.parseDouble(s + "");
                res *= -1;
                ans = String.valueOf(res);
                textView.setText(res + "");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().isEmpty()) {
                    String s = textView.getText().toString();
                    char ch = s.charAt(s.length() - 1);
                    if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                        a.add(s.length() - 1);
                        ans += "/";
                        textView.setText(textView.getText() + "/");
                    }
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().isEmpty()) {
                    String s = textView.getText().toString();
                    char ch = s.charAt(s.length() - 1);
                    if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                        a.add(s.length() - 1);
                        ans += "+";
                        textView.setText(textView.getText() + "+");
                    }
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().isEmpty()) {
                    String s = textView.getText().toString();
                    char ch = s.charAt(s.length() - 1);
                    if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                        a.add(s.length() - 1);
                        ans += "-";
                        textView.setText(textView.getText() + "-");
                    }
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().isEmpty()) {
                    String s = textView.getText().toString();
                    char ch = s.charAt(s.length() - 1);
                    if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                        a.add(s.length() - 1);
                        ans += "*";
                        textView.setText(textView.getText() + "*");
                    }


                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().isEmpty()) {
                    String s = ans;
                    char ch = s.charAt(s.length() - 1);
                    if (ch == '+' || ch == '-' || ch == '%' || ch == '*' || ch == '/' || ch == '.') {
                        Toast.makeText(getActivity(), "Invalid", Toast.LENGTH_SHORT).show();
                    } else {
                        a.add(s.length() - 1);
                        s += "=";
                        //String info="";
                        //boolean div=false,mult=false,sub=false,perc=false,add1=false;
                        double res = Double.parseDouble(s.substring(0, a.get(0) + 1));

                        for (int i = 0; i < a.size() - 1; i++) {
                            double answ = Double.parseDouble(s.substring(a.get(i) + 2, a.get(i + 1) + 1));
                            if (s.charAt(a.get(i) + 1) == '+') {
                                res += answ;
                            } else if (s.charAt(a.get(i) + 1) == '-') {
                                res -= answ;
                            } else if (s.charAt(a.get(i) + 1) == '/') {
                                res /= answ;
                            } else if (s.charAt(a.get(i) + 1) == '*') {
                                res *= answ;
                            } else if (s.charAt(a.get(i) + 1) == '%') {
                                res = (res) * (answ) / 10000;
                            }
                        }
                        String answer = String.valueOf(res);
                        a.clear();
                        //int check=0; //first time
                        //String answ= String.valueOf(a.size());
                        tvResult.setText(answer);
                        //a.add(answer.length()-1);
                        ans = answer;
                    }
                }
            }
        });
        return root;
    }
}