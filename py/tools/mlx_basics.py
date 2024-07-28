import mlx.core as mx
import mlx.nn as nn
import mlx.optimizers as optim

rnd_vec = mx.random.normal(shape=[10])
print(type(rnd_vec))
print(rnd_vec)

vec = rnd_vec.reshape(-1)
print(vec)

matrix = rnd_vec.reshape(5, 2)
print(matrix)

three_d_array = rnd_vec.reshape(2, 5, 1)
print(three_d_array)


class LinearRegressor(nn.Module):
    def __init__(self):
        super(LinearRegressor, self).__init__()
        self.linear = nn.Linear(input_dims=1, output_dims=1)

    def __call__(self, x):
        return self.linear(x)


lin_reg_model = LinearRegressor()

for name, params in lin_reg_model.parameters().items():
    print(name, params)


def loss_fn(model, x, y):
    return nn.losses.mse_loss(model(x), y)


loss_and_grad_fn = nn.value_and_grad(lin_reg_model, loss_fn)
optimizer = optim.SGD(learning_rate=0.1)


x_train = mx.random.normal([10, 1])
print(x_train)
y_train = 3 * x_train + 2

for epoch in range(100):
    loss, grads = loss_and_grad_fn(lin_reg_model, x_train, y_train)
    optimizer.update(lin_reg_model, grads)
    mx.eval(lin_reg_model.parameters(), optimizer.state)


x_test = mx.array([5.0])
y_test = lin_reg_model(x_test)
print(y_test.item())
