#pong

import turtle

wn = turtle.Screen()
wn.title("Pong")
wn.bgcolor("black")
wn.setup(width=800, height =600)
wn.tracer(0)

#Paddle A
paddle_a = turtle.Turtle()
paddle_a.speed(0)
paddle_a.shape("square")
paddle_a.color("white")
paddle_a.penup()
paddle_a.goto(-350,0)
paddle_a.shapesize(stretch_wid=5, stretch_len=1)


#Paddle B
paddle_b = turtle.Turtle()
paddle_b.speed(0)
paddle_b.shape("square")
paddle_b.color("white")
paddle_b.penup()
paddle_b.goto(350,0)
paddle_b.shapesize(stretch_wid=5, stretch_len=1)

#Ball
ball = turtle.Turtle()
ball.speed(0)
ball.shape("square")
ball.color("white")
ball.penup()
#ball.goto(0,0)
ball.shapesize(stretch_wid=1, stretch_len=1)
ball.dy = ball.dx = 0.1

#Players
player_a = 0
player_b = 0

#Fucntions
def paddle_a_up():
    y = paddle_a.ycor()
    y += 20
    paddle_a.sety(y)

def paddle_a_down():
    y = paddle_a.ycor()
    y -= 20
    paddle_a.sety(y)

def paddle_b_up():
    y = paddle_b.ycor()
    y += 20
    paddle_b.sety(y)

def paddle_b_down():
    y = paddle_b.ycor()
    y -= 20
    paddle_b.sety(y)

#Key Bindings
wn.listen()
wn.onkeypress(paddle_a_up, "w")
wn.onkeypress(paddle_a_down, "s")
wn.onkeypress(paddle_b_up, "Up")
wn.onkeypress(paddle_b_down, "Down")

#Main Loop
while True:
    wn.update()
    
    #Move ball
    ball.setx(ball.xcor() + ball.dx)
    ball.sety(ball.ycor() + ball.dy)

    #Border checking
    if abs(ball.ycor()) > 290:
        ball.sety(290 * (ball.ycor()/abs(ball.ycor())))
        ball.dy *= -1
    
    #Paddle Check
    if abs(ball.xcor()) ==  350:
        if ball.xcor() == 350:
            if (ball.ycor() >= paddle_b.ycor() -2.5) and (ball.ycor()<= paddle_b.ycor() + 2.5):
                ball.setx(350)
                ball.dx *= -1
        if ball.xcor() == -350:
            if (ball.ycor() >= paddle_a.ycor() -2.5) and (ball.ycor()<= paddle_a.ycor() + 2.5):
                ball.setx(-350)
                ball.dx *= -1
    #Goal Checking
    if abs(ball.xcor()) > 390:
        if ball.xcor() > 390:
            player_a += 1
        if ball.ycor() < -390:
            player_b += 1
            
        #reset ball pos
        ball.sety(0)
        ball.setx(0)
