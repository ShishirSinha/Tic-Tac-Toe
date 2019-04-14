package com.example.multiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TicTacToe extends AppCompatActivity {

    int t=1;
    int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        Button resetBtn=(Button) findViewById(R.id.resetBtn);
        final TextView pturn=(TextView) findViewById(R.id.p_turn);

        final ImageView i1=(ImageView) findViewById(R.id.i1);
        final ImageView i2=(ImageView) findViewById(R.id.i2);
        final ImageView i3=(ImageView) findViewById(R.id.i3);
        final ImageView i4=(ImageView) findViewById(R.id.i4);
        final ImageView i5=(ImageView) findViewById(R.id.i5);
        final ImageView i6=(ImageView) findViewById(R.id.i6);
        final ImageView i7=(ImageView) findViewById(R.id.i7);
        final ImageView i8=(ImageView) findViewById(R.id.i8);
        final ImageView i9=(ImageView) findViewById(R.id.i9);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pturn.setVisibility(View.VISIBLE);
                pturn.setText(getString(R.string.player1_s_turn));
                t=1;
                p1=p2=p3=p4=p5=p6=p7=p8=p9=0;
                hide_pwon();
                ImageView line=(ImageView)findViewById(R.id.line);
                line.setVisibility(View.INVISIBLE);
                i1.setImageResource(R.drawable.nothing);
                i2.setImageResource(R.drawable.nothing);
                i3.setImageResource(R.drawable.nothing);
                i4.setImageResource(R.drawable.nothing);
                i5.setImageResource(R.drawable.nothing);
                i6.setImageResource(R.drawable.nothing);
                i7.setImageResource(R.drawable.nothing);
                i8.setImageResource(R.drawable.nothing);
                i9.setImageResource(R.drawable.nothing);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1 == 0) {
                    if (t % 2 == 1) {
                        p1 = 1;
                        i1.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p1 = 2;
                        i1.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p2 == 0) {
                    if (t % 2 == 1) {
                        p2 = 1;
                        i2.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p2 = 2;
                        i2.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p3 == 0) {
                    if (t % 2 == 1) {
                        p3 = 1;
                        i3.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p3 = 2;
                        i3.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p4 == 0) {
                    if (t % 2 == 1) {
                        p4 = 1;
                        i4.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p4 = 2;
                        i4.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p5 == 0) {
                    if (t % 2 == 1) {
                        p5 = 1;
                        i5.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p5 = 2;
                        i5.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p6 == 0) {
                    if (t % 2 == 1) {
                        p6 = 1;
                        i6.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p6 = 2;
                        i6.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p7 == 0) {
                    if (t % 2 == 1) {
                        p7 = 1;
                        i7.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p7 = 2;
                        i7.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p8 == 0) {
                    if (t % 2 == 1) {
                        p8 = 1;
                        i8.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p8 = 2;
                        i8.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p9 == 0) {
                    if (t % 2 == 1) {
                        p9 = 1;
                        i9.setImageResource(R.drawable.cross);
                        pturn.setText(getString(R.string.player2_turn));
                    } else {
                        p9 = 2;
                        i9.setImageResource(R.drawable.circle);
                        pturn.setText(getString(R.string.player1_s_turn));
                    }
                    t++;
                    if(check())
                        pturn.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private boolean check() {

        if((p1==1 && p2==1 && p3==1) || (p4==1 && p5==1 && p6==1) || (p7==1 && p8==1 && p9==1)
                || (p1==1 && p4==1 && p7==1) || (p2==1 && p5==1 && p8==1) || (p3==1 && p6==1 && p9==1)
                || (p1==1 && p5==1 && p9==1) || (p3==1 && p5==1 && p7==1)) {

            TextView pwon=(TextView) findViewById(R.id.p_won);
            ImageView line=(ImageView) findViewById(R.id.line);

            if(p3==1 && p5==1 && p7==1) {
                line.setImageResource(R.drawable.l357c);
                line.setVisibility(View.VISIBLE);
            }
            else if(p1==1 && p5==1 && p9==1) {
                line.setImageResource(R.drawable.l159c);
                line.setVisibility(View.VISIBLE);
            }
            else if(p1==1 && p2==1 && p3==1) {
                line.setImageResource(R.drawable.l123c);
                line.setVisibility(View.VISIBLE);
            }
            else if(p4==1 && p5==1 && p6==1) {
                line.setImageResource(R.drawable.l456c);
                line.setVisibility(View.VISIBLE);
            }
            else if(p7==1 && p8==1 && p9==1) {
                line.setImageResource(R.drawable.l789c);
                line.setVisibility(View.VISIBLE);
            }
            else if(p1==1 && p4==1 && p7==1) {
                line.setImageResource(R.drawable.l147c);
                line.setVisibility(View.VISIBLE);
            }
            else if(p2==1 && p5==1 && p8==1) {
                line.setImageResource(R.drawable.l258c);
                line.setVisibility(View.VISIBLE);
            }
            else if(p3==1 && p6==1 && p9==1) {
                line.setImageResource(R.drawable.l369c);
                line.setVisibility(View.VISIBLE);
            }
            pwon.setText(getString(R.string.player1_won));
            pwon.setVisibility(View.VISIBLE);

            p1=p2=p3=p4=p5=p6=p7=p8=p9=3;
            t=1;
            return true;
        }

        if((p1==2 && p2==2 && p3==2) || (p4==2 && p5==2 && p6==2) || (p7==2 && p8==2 && p9==2)
                || (p1==2 && p4==2 && p7==2) || (p2==2 && p5==2 && p8==2) || (p3==2 && p6==2 && p9==2)
                || (p1==2 && p5==2 && p9==2) || (p3==2 && p5==2 && p7==2)) {
            
            TextView pwon=(TextView) findViewById(R.id.p_won);
            ImageView line=(ImageView) findViewById(R.id.line);

            if(p3==2 && p5==2 && p7==2) {
                line.setImageResource(R.drawable.l357r);
                line.setVisibility(View.VISIBLE);
            }
            else if(p1==2 && p5==2 && p9==2) {
                line.setImageResource(R.drawable.l159r);
                line.setVisibility(View.VISIBLE);
            }
            else if(p1==2 && p2==2 && p3==2) {
                line.setImageResource(R.drawable.l123r);
                line.setVisibility(View.VISIBLE);
            }
            else if(p4==2 && p5==2 && p6==2) {
                line.setImageResource(R.drawable.l456r);
                line.setVisibility(View.VISIBLE);
            }
            else if(p7==2 && p8==2 && p9==2) {
                line.setImageResource(R.drawable.l789r);
                line.setVisibility(View.VISIBLE);
            }
            else if(p1==2 && p4==2 && p7==2) {
                line.setImageResource(R.drawable.l147r);
                line.setVisibility(View.VISIBLE);
            }
            else if(p2==2 && p5==2 && p8==2) {
                line.setImageResource(R.drawable.l258r);
                line.setVisibility(View.VISIBLE);
            }
            else if(p3==2 && p6==2 && p9==2) {
                line.setImageResource(R.drawable.l369r);
                line.setVisibility(View.VISIBLE);
            }
            pwon.setText(getString(R.string.player2_won));
            pwon.setVisibility(View.VISIBLE);

            p1=p2=p3=p4=p5=p6=p7=p8=p9=3;
            t=1;
            return true;
        }

        if(t==10) {

            TextView pwon=(TextView) findViewById(R.id.p_won);

            pwon.setText(getString(R.string.match_draw));
            pwon.setVisibility(View.VISIBLE);
            return true;
        }

        return false;
    }
    private void hide_pwon() {
        TextView pwon=(TextView) findViewById(R.id.p_won);
        pwon.setVisibility(View.INVISIBLE);
    }
}